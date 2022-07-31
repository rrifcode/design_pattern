package com.rrif.pattern.goods;

/**
 * 实物奖品发放信息封装
 */
public class DeliverReq {

    /** 用户姓名 */
    private String userName;
    /** 用户手机号 */
    private String userPhone;
    /** 商品sku */
    private String sku;
    /** 订单id */
    private String orderId;
    /** 收件人姓名 */
    private String consigneeUserName;
    /** 收件人电话 */
    private String consigneeUserPhone;
    /** 收件人地址 */
    private String consigneeUserAddress;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getConsigneeUserName() {
        return consigneeUserName;
    }

    public void setConsigneeUserName(String consigneeUserName) {
        this.consigneeUserName = consigneeUserName;
    }

    public String getConsigneeUserPhone() {
        return consigneeUserPhone;
    }

    public void setConsigneeUserPhone(String consigneeUserPhone) {
        this.consigneeUserPhone = consigneeUserPhone;
    }

    public String getConsigneeUserAddress() {
        return consigneeUserAddress;
    }

    public void setConsigneeUserAddress(String consigneeUserAddress) {
        this.consigneeUserAddress = consigneeUserAddress;
    }


}
