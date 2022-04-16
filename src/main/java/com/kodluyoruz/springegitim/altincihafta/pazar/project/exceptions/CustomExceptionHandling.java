package com.kodluyoruz.springegitim.altincihafta.pazar.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandling {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> methodExceptionHandler(Exception ex) {
        String  message = "Exception" + ex.getMessage();
        return new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
