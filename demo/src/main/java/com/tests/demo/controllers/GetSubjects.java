package com.tests.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GetSubjects {
    private SubjectsInterface subjects;

    public GetSubjects(SubjectsInterface subjectsInterface) {
        this.subjects = subjectsInterface;
    }

    public List<Subjects> getSubjects() {
        return subjects.findAll();
    }
}
