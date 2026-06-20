package com.tests.demo.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @JsonProperty("school")
    String schoolName;

    // create relationshpi school--> students
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    List<Students> students;

    public School() {
    }

    public School(String name) {
        this.schoolName = name;
    }
}
