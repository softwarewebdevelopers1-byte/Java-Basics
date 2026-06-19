package com.tests.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GetSubjects {
    @GetMapping("/subjects/{userId}")
    public String subjects(@PathVariable("userId") String userId) {
        return userId;
    }

    // http://localhost:8000/subjects?subjectId=english&userId=2
    @GetMapping("/subjects")
    public String getMethodName(@RequestParam("subjectId") String subjectId, @RequestParam("userId") String userId) {
        return subjectId + " " + userId;
    }

}

