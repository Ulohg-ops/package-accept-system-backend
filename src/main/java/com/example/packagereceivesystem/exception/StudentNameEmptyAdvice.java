package com.example.packagereceivesystem.exception;


import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class StudentNameEmptyAdvice {
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> exceptionHandler(ConstraintViolationException exception){
        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("errorMessage","sdasadko");
        return errorMap;
    }
}
