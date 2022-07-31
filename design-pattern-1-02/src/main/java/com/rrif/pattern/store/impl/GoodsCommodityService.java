package com.rrif.pattern.store.impl;


import com.rrif.pattern.goods.DeliverReq;
import com.rrif.pattern.goods.GoodsService;
import com.rrif.pattern.store.ICommodity;

import java.util.Map;

public class GoodsCommodityService implements ICommodity {

    GoodsService goodsService = new GoodsService();


    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        DeliverReq req = new DeliverReq();
        req.setSku(commodityId);
        req.setUserName(queryUserName(uId));
        req.setUserPhone(queryUserPhone(uId));
        req.setOrderId(bizId);
        req.setConsigneeUserName(extMap.get("consigneeUserName"));
        req.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        req.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));
        goodsService.deliverGoods(req);
    }

    private String queryUserPhone(String uId) {
        return "13333333333";
    }

    private String queryUserName(String uId){
        return "张三";
    }
}
