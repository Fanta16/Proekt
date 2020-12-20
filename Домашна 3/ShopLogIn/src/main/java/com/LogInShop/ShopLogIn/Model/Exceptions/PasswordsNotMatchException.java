package com.LogInShop.ShopLogIn.Model.Exceptions;

public class PasswordsNotMatchException extends RuntimeException {
    public PasswordsNotMatchException() {
        super("Passwords do not match");
    }
}
