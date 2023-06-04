package com.yk.springcloud.alibaba.service;

import com.yk.springcloud.entities.CommonResult;
import com.yk.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: Yangk
 * @Date:2023/6/4 - 06 - 04 - 12:34
 * @Descrption: com.yk.springcloud.alibaba.service
 * @version: 1.8
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}