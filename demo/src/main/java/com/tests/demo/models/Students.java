package com.tests.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// creating jpa data persistency class 
@Entity
@Table(name = "students")
public class Students {
    // id to be generated in the database
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @JsonProperty("Name")
    @Column(name = "full_name")
    String fullName;

    @JsonProperty("Admission")
    @Column(name = "admission", unique = true)
    Long adm;

    public Students() {
    }

    public Students(String fullName, Long Adm) {
        this.fullName = fullName;
        this.adm = Adm;
    }
}
