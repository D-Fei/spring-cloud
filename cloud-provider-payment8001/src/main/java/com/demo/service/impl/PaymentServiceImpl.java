package com.demo.service.impl;

import com.demo.dao.PaymentDao;
import com.demo.entities.Payment;
import com.demo.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
