package com.yk.springcloud.controller;/**
 * @Title: OrderFeignController
 * @Author YangK
 * @Package com.yk.springcloud.controller
 * @Date 2023/5/10 20:11
 * @description:
 */

import com.yk.springcloud.entities.CommonResult;
import com.yk.springcloud.entities.Payment;
import com.yk.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author YangCoder
 * @version 2023/5/10 20:11
 * @since JDK8
 */
@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeOut()
    {
        return paymentFeignService.paymentFeignTimeOut();
    }

}

