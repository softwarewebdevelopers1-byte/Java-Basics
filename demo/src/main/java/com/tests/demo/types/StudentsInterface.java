package com.tests.demo.types;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tests.demo.models.Students;

public interface StudentsInterface extends JpaRepository<Students, Long> {

}
