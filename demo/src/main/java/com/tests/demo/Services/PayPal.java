package com.tests.demo.Services;

import org.springframework.stereotype.Service;

@Service
public class PayPal implements PaymentServices {
    @Override
    public void pay(double amount) {
        System.out.println("Paypal amount paid is" + " " + amount);
    }
}
