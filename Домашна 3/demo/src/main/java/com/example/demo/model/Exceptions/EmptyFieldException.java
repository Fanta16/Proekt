package com.example.demo.model.Exceptions;

public class EmptyFieldException extends RuntimeException{
    public EmptyFieldException(){
        super("AllFieldsAreRequired!");
    }
}
