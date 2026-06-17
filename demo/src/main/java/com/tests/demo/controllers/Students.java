package com.tests.demo.controllers;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "students_data", uniqueConstraints = {
    @UniqueConstraint(name = "adm_unique_key", columnNames = "Adm") })
public class Students {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "adm", unique = true, nullable = false, length = 100)
  private int Admission;

  @Column(name = "f_name")
  private String fullName;

  public Students() {
  }

  public void setAdmission(int adm) {
    this.Admission = adm;
  }

  public void setFullName(String name) {
    this.fullName = name;
  }

  @Override
  public String toString() {
    return "Student" + ":" + "{" + "id:" + id + " " + "Admission:" + " " + Admission + " " + "FullName:" + " "
        + fullName
        + "}";
  }
}
