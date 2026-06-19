package com.tests.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tests.demo.models.Students;
import com.tests.demo.types.StudentsInterface;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class FindStudent {
    private final StudentsInterface student;

    public FindStudent(StudentsInterface studentsInterface) {
        this.student = studentsInterface;
    }

    // findind single student by id
    @GetMapping("/get/student/{id}")
    public Students GetStudents(@PathVariable("id") Long id) {
        return student.findById(id).orElse(new Students());
    }

    // finding all students
    @GetMapping("/get/all/students")
    public List<Students> GetAllStudents() {
        return student.findAll();
    }
}
