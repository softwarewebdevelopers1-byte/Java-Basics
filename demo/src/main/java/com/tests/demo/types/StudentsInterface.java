package com.tests.demo.types;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tests.demo.models.Students;

public interface StudentsInterface extends JpaRepository<Students, Long> {
    List<Students> findAllByFullNameContaining(String FullName);
}
