package com.rrif.pattern;

import java.util.Map;

/**
 * 统一请求入参封装
 */
public class AwardRequest {

    /** 用户唯一id */
    private String uId;
    /** 奖品类型，1. 优惠券， 2. 实物奖品， 3. 第三方兑换卡（爱奇艺） */
    private Integer awardType;
    /** 奖品编号：sku, couponNumber, cardId */
    private String awardNumber;
    /** 业务id，用于防重 */
    private String bizId;
    /** 扩展信息，用于收件人地址等信息 */
    private Map<String, String> extMap;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }
}
