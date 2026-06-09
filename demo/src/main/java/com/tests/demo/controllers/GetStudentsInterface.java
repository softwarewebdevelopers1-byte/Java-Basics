package com.tests.demo.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetStudentsInterface extends JpaRepository<Students,Long> {
}
