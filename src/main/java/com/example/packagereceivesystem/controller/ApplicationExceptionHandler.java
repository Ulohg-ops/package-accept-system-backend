package com.example.packagereceivesystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApplicationExceptionHandler {
    @ResponseStatus(
            value = HttpStatus.INTERNAL_SERVER_ERROR,
            reason = "Requested Student Not Found")
    @ExceptionHandler(NoSuchElementFoundException.class)
    public void handleException(NoSuchElementFoundException e) {
    }
}
