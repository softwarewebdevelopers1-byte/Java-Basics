package com.tests.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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

    // creating relationship
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentProfile profile;
    // create a relationship between students and school
    @ManyToOne
    @JoinColumn(name = "school_id")
    @JsonBackReference
    private School school;

    public Students() {
    }

    public Students(String fullName, Long Adm) {
        this.fullName = fullName;
        this.adm = Adm;
    }

    public void setSchool(School name) {
        this.school = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public School getSchool() {
        return school;
    }
}
