package com.LogInShop.ShopLogIn.Model.Exceptions;

public class EmptyFieldException extends RuntimeException{
    public EmptyFieldException(){
        super("AllFieldsAreRequired!");
    }
}
