package com.kodluyoruz.springegitim.dorduncuhafta.cmt.springbootexception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<String> methodNullPointerExceptionHandler(NullPointerException ex) {
        return new ResponseEntity<String>("null data is entered", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
