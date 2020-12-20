package com.LogInShop.ShopLogIn.Model.Exceptions;

public class InvalidUserCredentialsException extends RuntimeException {
    public InvalidUserCredentialsException(String message) {
        super(message);
    }
    public InvalidUserCredentialsException() {
        super();
    }
}
