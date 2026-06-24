package com.tests.demo.global;

import java.util.HashMap;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> HandleInvalidInput(MethodArgumentNotValidException mException) {
        var error = new HashMap<>();
        mException.getBindingResult().getFieldErrors().forEach(e -> error.put(e.getField(), e.getDefaultMessage()));
        return ResponseEntity.status(400).body(error);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<?> HandleDuplicateInput(DataIntegrityViolationException dataIntegrityViolationException) {
        var error = new HashMap<>();
        dataIntegrityViolationException.getCause().getMessage();
        return ResponseEntity.status(409).body(error);
    }
}
