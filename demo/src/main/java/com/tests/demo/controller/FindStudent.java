package com.tests.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tests.demo.models.Student;
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
    public Student GetStudents(@PathVariable("id") Long id) {
        return student.findById(id).orElse(new Student());
    }

    // finding all students
    @GetMapping("/get/all/students")
    public List<Student> GetAllStudents() {
        return student.findAll();
    }

    // getting all students with a specific name
    @GetMapping("/get/all/students-fullname/{name}")
    public List<Student> GetStudentsByFullName(@PathVariable("name") String name) {
        return student.findAllByFullNameContaining(name);
    }

}
