package com.yk.springcloud.alibaba.controller;/**
 * @Title: OrderController
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.controller
 * @Date 2023/6/10 17:53
 * @description:
 */

import com.yk.springcloud.alibaba.domain.CommonResult;
import com.yk.springcloud.alibaba.domain.Order;
import com.yk.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author YangCoder
 * @version 2023/6/10 17:53
 * @since JDK8
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}

