package com.tests.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class GetSubjects {
    @GetMapping("/subjects/{userId}")
    public String subjects(@PathVariable("userId") String userId) {
        return userId;
    }

}
