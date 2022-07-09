package com.atguigu.cloud.service.impl;

import com.atguigu.cloud.dao.PaymentDao;
import com.atguigu.cloud.service.PaymentService;
import com.atguigu.springcloud.entities.Payment;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhangY on 2022/5/24 0:03
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
