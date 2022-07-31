package com.rrif.pattern.coupon;

/**
 * 优惠券发放服务
 */
public class CouponService {
    public CouponResult send(String uid, String couponNumber, String uuid){
        System.out.println("模拟发放优惠券一张：" + uid + ": " + couponNumber + ": " + uuid);
        return new CouponResult("200", "发放成功！");
    }
}
