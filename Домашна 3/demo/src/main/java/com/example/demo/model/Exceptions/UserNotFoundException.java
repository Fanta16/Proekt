package com.example.demo.model.Exceptions;

import net.bytebuddy.implementation.bind.annotation.Super;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("UserNotFound!");
    }
}
