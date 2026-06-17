package com.tests.demo.auth;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tests.demo.models.Students;
import com.tests.demo.types.StudentsInterface;

@RestController
public class SignUp {
    private final StudentsInterface students;

    // constructor injection
    public SignUp(StudentsInterface studentsInterface) {
        this.students = studentsInterface;
    }

    @PostMapping("/create-account/student")
    public Students CreateAccount(@RequestBody Students student) {
        return students.save(student);
    }
}
