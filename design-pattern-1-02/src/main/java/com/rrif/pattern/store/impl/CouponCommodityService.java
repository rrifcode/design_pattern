package com.rrif.pattern.store.impl;

import com.rrif.pattern.coupon.CouponService;
import com.rrif.pattern.store.ICommodity;

import java.util.Map;

public class CouponCommodityService implements ICommodity {

    CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        couponService.send(uId,commodityId, bizId);
    }
}
