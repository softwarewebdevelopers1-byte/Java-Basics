package com.tests.demo.auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tests.demo.DTO.StudentDTO;
import com.tests.demo.models.School;
import com.tests.demo.models.Student;
import com.tests.demo.types.StudentsInterface;

@RestController
public class SignUp {
    private final StudentsInterface students;

    // constructor injection
    public SignUp(StudentsInterface studentsInterface) {
        this.students = studentsInterface;
    }

    @PostMapping("/create-account/student")
    public Student CreateAccount(@RequestBody StudentDTO dto) {
        Student studentDTO = toStudent(dto);
        return students.save(studentDTO);
    }

    private Student toStudent(StudentDTO dto) {
        var student = new Student();
        var school = new School();
        student.setFullName(dto.fullName());
        student.setAdm(dto.adm());

        school.setId(dto.school_id());
        // assign school object to student
        student.setSchool(school);
        return student;
    }
}
