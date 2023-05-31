package com.yk.springcloud.service;/**
 * @Title: PaymentFallbackService
 * @Author YangK
 * @Package com.yk.springcloud.service
 * @Date 2023/5/12 19:03
 * @description:
 */

import org.springframework.stereotype.Component;

/**
 *
 * @author YangCoder
 * @version 2023/5/12 19:03
 * @since JDK8
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80-paymentInfo_OK";

    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80-paymentInfo_TimeOut";
    }
}

