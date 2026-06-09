package com.tests.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tests.demo.Services.PaymentServices;

@RestController
public class Login {
    private PaymentServices pServices;
    private final GetStudents students;

    Login(@Qualifier("payStack") PaymentServices paymentServices, GetStudents students) {
        this.pServices = paymentServices;
        this.students = students;
    }

    @GetMapping("/")
    public String Verify() {
        pServices.pay(20);
        List<Students> student = students.getStudents();
        student.forEach(s -> {
            System.out.println(s.toString());
        });
        return student.toString();
    }
}
