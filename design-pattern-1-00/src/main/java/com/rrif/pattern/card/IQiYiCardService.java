package com.rrif.pattern.card;

/**
 * 爱奇艺会员卡服务
 * @author bai
 */
public class IQiYiCardService {

    public void send(String bindPhone, String cardId){
        System.out.println("模拟发放爱奇艺会员卡一张:" + bindPhone + ": " + cardId);
    }
}
