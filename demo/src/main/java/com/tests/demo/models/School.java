package com.tests.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class School {
    @Id
    Integer id;

    String schoolName;

    // create relationshpi school--> students
    @OneToMany(mappedBy = "school")
    Students students;

    public School() {
    }

    public School(String name) {
        this.schoolName = name;
    }
}
