package com.tests.demo.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PayStack implements PaymentServices {
    private PaymentServices paymentServices;

    PayStack(@Qualifier("payPal") PaymentServices paymentServices) {
        this.paymentServices = paymentServices;
    }

    @Override
    public void pay(double amount) {
        paymentServices.pay(amount);
        System.out.println("PayStack amount paid is" + " " + amount);
    }
}
