package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    User login(String username, String password);
    User Register(String username, String password, String name, String surname);
}
