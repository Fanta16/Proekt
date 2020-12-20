package com.LogInShop.ShopLogIn.Model.Exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("UserNotFound!");
    }
}
