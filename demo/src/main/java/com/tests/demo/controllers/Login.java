package com.tests.demo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tests.demo.Services.PaymentServices;

@RestController
public class Login {
    private PaymentServices pServices;

    Login(@Qualifier("payStack") PaymentServices paymentServices) {
        this.pServices = paymentServices;
    }

    @GetMapping("/")
    public String Verify() {
        pServices.pay(20);
        return "Paid to the account!";
    }
}

