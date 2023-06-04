package com.yk.springcloud.alibaba.service;

import com.yk.springcloud.entities.CommonResult;
import com.yk.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author: Yangk
 * @Date:2023/6/4 - 06 - 04 - 12:35
 * @Descrption: com.yk.springcloud.alibaba.service
 * @version: 1.8
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
