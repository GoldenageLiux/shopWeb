package org.example.service;

import org.example.error.BusinessException;
import org.example.service.model.OrderModel;

/**
 * Created by liuxin on 2021/7/6
 */
public interface OrderService {
    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount) throws BusinessException;
}
