package com.example.packagereceivesystem.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(FieldEmptyException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> EmptyFieldExceptionHandler(FieldEmptyException exception){
        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("errorMessage",exception.getMessage());
        return errorMap;
    }
    @ResponseBody
    @ExceptionHandler(StudentNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> StudentNotFoundExceptionHandler(StudentNotFoundException exception){
        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("errorMessage",exception.getMessage());
        return errorMap;
    }
}
