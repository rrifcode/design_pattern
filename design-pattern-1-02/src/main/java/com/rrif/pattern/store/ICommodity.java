package com.rrif.pattern.store;

import java.util.Map;

/**
 * 抽象发放奖品逻辑
 */
public interface ICommodity {

    /**
     * 发放奖品逻辑
     * @param uId 用户id
     * @param commodityId 商品id
     * @param bizId 业务id
     * @param extMap 扩展字段
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap);
}
