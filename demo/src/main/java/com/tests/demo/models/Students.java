package com.tests.demo.models;

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

    @Column(name = "full_name")
    String fullName;

    @Column(name = "admission", unique = true)
    Long adm;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAdm(Long adm) {
        this.adm = adm;
    }
}
