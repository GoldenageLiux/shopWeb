package org.example.service.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by liuxin on 2021/7/6
 */
@Getter
@Setter
public class OrderModel {
    /**
     * String类型
     */
    private String id;

    /**
     * 购买的用户id
     */
    private Integer userId;

    /**
     * 购买商品id
     */
    private Integer itemId;

    /**
     * 若非空，则表示是以秒杀商品方式下单
     */
    private Integer promoId;

    /**
     * 购买商品的单价
     * 若promoId非空，则表示秒杀商品价格
     */
    private BigDecimal itemPrice;

    /**
     * 购买数量
     */
    private Integer amount;

    /**
     * 购买金额
     * 若promoId非空，则表示秒杀商品价格
     */
    private BigDecimal orderPrice;

}
