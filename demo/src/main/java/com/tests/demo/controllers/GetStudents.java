package com.tests.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GetStudents {
    private GetStudentsInterface repoStudents;

    public GetStudents(GetStudentsInterface repoStudents) {
        this.repoStudents = repoStudents;
    }
    public List<Students> getStudents(){
        return repoStudents.findAll();
    }

}
