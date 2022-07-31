package com.rrif.pattern;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class ApiTest {

    private Logger log = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test(){
        PrizeController prizeController = new PrizeController();
        //[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
        System.out.println("模拟发放优惠券");
        AwardRequest request01 = new AwardRequest();
        request01.setuId("1001");
        request01.setAwardType(1);
        request01.setBizId("791098764902132");
        request01.setAwardNumber("EGM1023938910232121323432");
        prizeController.sendToUser(request01);

        System.out.println("模拟发放实物商品");
        AwardRequest request02 = new AwardRequest();
        request02.setuId("1001");
        request02.setAwardType(2);
        request02.setBizId("10230000201122211131");
        request02.setAwardNumber("982019872131");
        request02.setExtMap(new HashMap<String, String>(){{
            put("consigneeUserName", "张三");
            put("consigneeUserPhone", "13599999999");
            put("consigneeUserAddress", "台湾省台北市");
        }});
        prizeController.sendToUser(request02);

        System.out.println("模拟发放实物第三方兑换卡");
        AwardRequest request03 = new AwardRequest();
        request03.setuId("1001");
        request03.setAwardType(3);
        request03.setAwardNumber("AQY1xjkUodl8LO975GdfrYUio");
        prizeController.sendToUser(request03);


    }

}
