package com.demo.service;

import com.demo.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Integer id);
}
