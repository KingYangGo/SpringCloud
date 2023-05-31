package com.yk.springcloud.service;

import com.yk.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Title: PaymentService
 * @Author YangK
 * @Package com.yk.springcloud.service
 * @Date 2023/5/4 15:15
 * @description:
 */
public interface PaymentService {
    public  int create(Payment payment);
    public Payment getPaymentById(@Param("id")Long id);
}
