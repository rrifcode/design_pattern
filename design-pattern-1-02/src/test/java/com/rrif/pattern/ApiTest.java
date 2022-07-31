package com.rrif.pattern;

import com.rrif.pattern.store.ICommodity;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ApiTest {

    StoreFactory storeFactory = new StoreFactory();

    @Test
    public void test(){
        //1. 优惠券
        ICommodity couponService = storeFactory.getCommodityService(1);
        couponService.sendCommodity("1001", "EGM1023938910232121323432", "791098764902132", null);

        //2. 商品
        ICommodity goodsService = storeFactory.getCommodityService(2);
        Map<String,String> extMap = new HashMap<>();
        extMap.put("consigneeUserName", "张三");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "台湾省台北市");
        goodsService.sendCommodity("1001", "9820198721311", "1023000020112221113", extMap);

        //3. 第三方兑换卡
        ICommodity cardService = storeFactory.getCommodityService(3);
        cardService.sendCommodity("1001", "AQY1xjkUodl8LO975GdfrYUio", null, null);
    }

}
