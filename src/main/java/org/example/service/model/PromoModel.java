package org.example.service.model;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * Created by liuxin on 2021/7/9
 */
@Setter
@Getter
public class PromoModel {
    private Integer id;

    /**
     * 秒杀活动状态
     * 1:未开始 2:进行中 3:已结束
     */
    private Integer status;

    /**
     * 秒杀活动名称
     */
    private String promoName;

    /**
     * 秒杀活动开始时间
     */
    private DateTime startDate;

    /**
     * 秒杀活动结束时间
     */
    private DateTime endDate;

    /**
     * 秒杀活动的适用商品
     */
    private Integer itemId;

    /**
     * 秒杀活动的商品价格
     */
    private BigDecimal promoItemPrice;
}
