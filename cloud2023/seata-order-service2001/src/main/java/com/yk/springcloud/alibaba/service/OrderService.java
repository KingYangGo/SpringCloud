package com.yk.springcloud.alibaba.service;

import com.yk.springcloud.alibaba.domain.Order;

/**
 * @Title: OrderService
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.service
 * @Date 2023/6/10 17:50
 * @description:
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}


