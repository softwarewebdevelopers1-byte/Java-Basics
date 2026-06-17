package com.tests.demo.controllers;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id", nullable = false)
    private Long subjectId;

    @Column(name = "subject_name", nullable = false, length = 100)
    private String subjectName;

    @Column(name = "subject_type", nullable = false, length = 30)
    private String subjectType;

    private Subjects() {
    }

    @Override
    public String toString() {
        return "subjects: " + "{" + "subject_id" + subjectId + "subject_name" + subjectName + "subject_type"
                + subjectType + "}";
    }
}
