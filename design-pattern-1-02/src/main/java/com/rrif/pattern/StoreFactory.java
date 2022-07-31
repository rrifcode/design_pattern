package com.rrif.pattern;

import com.rrif.pattern.store.ICommodity;
import com.rrif.pattern.store.impl.CardCommodityService;
import com.rrif.pattern.store.impl.CouponCommodityService;
import com.rrif.pattern.store.impl.GoodsCommodityService;


public class StoreFactory {


    public ICommodity getCommodityService(Integer type){
        if(null == type){
            return null;
        }

        switch (type){
            case 1:
                return new CardCommodityService();
            case 2:
                return new GoodsCommodityService();
            case 3:
                return new CouponCommodityService();
            default:throw new RuntimeException("没有对应的服务类型");
        }


    }

}
