package com.rrif.pattern.store.impl;

import com.rrif.pattern.card.IQiYiCardService;
import com.rrif.pattern.store.ICommodity;

import java.util.Map;

/**
 * 第三方兑换卡（爱奇艺兑换卡）
 */
public class CardCommodityService implements ICommodity {

    IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        String phone = queryUserMobile(uId);
        iQiYiCardService.send(phone, commodityId);
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }

}
