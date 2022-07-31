package com.rrif.pattern;


import com.alibaba.fastjson.JSON;
import com.rrif.pattern.card.IQiYiCardService;
import com.rrif.pattern.coupon.CouponResult;
import com.rrif.pattern.coupon.CouponService;
import com.rrif.pattern.goods.DeliverReq;
import com.rrif.pattern.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体发放奖品的业务逻辑
 */
public class PrizeController {

    private Logger log = LoggerFactory.getLogger(PrizeController.class);

    public AwardResponse sendToUser(AwardRequest request){
        log.info("奖品发放开始{}: req:{}", request.getuId(), JSON.toJSON(request));
        // 按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
        AwardResponse response = null;
        try{
            if(1 == request.getAwardType()){
                CouponService couponService = new CouponService();
                CouponResult result = couponService.send(request.getuId(), request.getAwardNumber(), request.getBizId());
                if(result.success()){
                    response = new AwardResponse("200", "success");
                }else {
                    response = new AwardResponse("500", result.getInfo());
                }
            }else if (2 == request.getAwardType()){
                DeliverReq req = new DeliverReq();
                req.setUserName(queryUserName(request.getuId()));
                req.setUserPhone(queryUserPhone(request.getuId()));
                req.setSku(request.getAwardNumber());
                req.setOrderId(request.getBizId());
                req.setConsigneeUserName(request.getExtMap().get("consigneeUserName"));
                req.setConsigneeUserPhone(request.getExtMap().get("consigneeUserPhone"));
                req.setConsigneeUserAddress(request.getExtMap().get("consigneeUserAddress"));
                GoodsService goodsService = new GoodsService();
                Boolean success = goodsService.deliverGoods(req);
                if (success){
                    response = new AwardResponse("200", "success");
                }else {
                    response = new AwardResponse("500", "failure");
                }

            }else if (3 == request.getAwardType()){
                String phone = queryUserPhone(request.getuId());
                IQiYiCardService cardService = new IQiYiCardService();
                cardService.send(phone, request.getAwardNumber());
                response = new AwardResponse("200", "success");
            }
            log.info("奖品发放完成{}.", request.getuId());
        }catch (Exception e){
            log.info("奖品发放失败{}. request:{}", request.getuId(), JSON.toJSON(request));
            response = new AwardResponse("500", e.getMessage());
        }

        return response;
    }


    private String queryUserName(String uId){
        return "小花";
    }

    private String queryUserPhone(String uId){
        return "13000000000";
    }



}
