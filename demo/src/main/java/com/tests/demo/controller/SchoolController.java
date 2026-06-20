package com.tests.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tests.demo.models.School;
import com.tests.demo.types.SchoolInterface;

@RestController
public class SchoolController {
    SchoolInterface schoolInterface;

    public SchoolController(SchoolInterface schoolInterface) {
        this.schoolInterface = schoolInterface;
    }

    @PostMapping("/schools")
    public School CreateSchool(@RequestBody School school) {
        return schoolInterface.save(school);
    }
}
