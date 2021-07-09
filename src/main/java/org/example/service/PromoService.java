package org.example.service;

import org.example.service.model.PromoModel;

/**
 * Created by liuxin on 2021/7/9
 */
public interface PromoService {
    //根据ItemId获取即将进行或正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
}
