package com.tests.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tests.demo.Services.PaymentServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Login {
    private PaymentServices pServices;
    private final GetStudents students;
    private final GetSubjects subjectsList;
    private final GetStudentsInterface repository;

    Login(@Qualifier("payStack") PaymentServices paymentServices, GetStudents students, GetSubjects subjects,
            GetStudentsInterface repoInterface) {
        this.pServices = paymentServices;
        this.students = students;
        this.subjectsList = subjects;
        this.repository = repoInterface;
    }

    @GetMapping("/")
    public String Verify() {
        pServices.pay(20);
        List<Students> student = students.getStudents();
        List<Subjects> subjects = subjectsList.getSubjects();
        subjects.forEach(subject -> {
            System.out.println("Subjects Data fetched " + subject.toString());
        });
        student.forEach(s -> {
            System.out.println("Students Data fetched " + s.toString());
        });
        return student.toString();
    }

    @PostMapping("/students")
    public Students postStudents(@RequestBody Students students) {
        System.out.println(students);
        return repository.save(students);
    }

}
