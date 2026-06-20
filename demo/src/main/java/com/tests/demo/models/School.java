package com.tests.demo.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class School {
    @Id
    Integer id;

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
