package com.example.packagereceivesystem.exception;

public class FieldEmptyException extends RuntimeException{
    public FieldEmptyException() {
        super("Name can not be empty");
    }


}
