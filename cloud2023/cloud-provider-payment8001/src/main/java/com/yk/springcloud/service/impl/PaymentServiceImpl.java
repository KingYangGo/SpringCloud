package com.yk.springcloud.service.impl;/**
 * @Title: PaymentServiceImpl
 * @Author YangK
 * @Package com.yk.springcloud.service.impl
 * @Date 2023/5/4 15:17
 * @description:
 */

import com.yk.springcloud.dao.PaymentDao;
import com.yk.springcloud.entities.Payment;
import com.yk.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * @author YangCoder
 * @version 2023/5/4 15:17
 * @since JDK8
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        int tt = 12;
        System.out.println(tt);
        return paymentDao.getPaymentById(id);
    }
}

