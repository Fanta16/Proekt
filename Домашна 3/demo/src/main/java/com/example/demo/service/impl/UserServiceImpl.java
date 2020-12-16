package com.example.demo.service.impl;

import com.example.demo.model.Exceptions.EmptyFieldException;
import com.example.demo.model.Exceptions.InvalidUserCredentialsException;
import com.example.demo.model.Exceptions.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        if (username == null || username.isEmpty() ||  password == null || password.isEmpty()) //Dali treba username da ne e null tuka poso ima exception za pass
        throw new InvalidUserCredentialsException();
        if(userRepository.findByUsername(username).isEmpty()){
            throw new UserNotFoundException();
        }
        User user = userRepository.findByUsername(username).get();

        if(!user.getPassword().equals(password))
            throw new InvalidUserCredentialsException();

        return user;
    }

    @Override
    public User Register(String username, String password, String name, String surname) {
        if (username == null || username.isEmpty() ||  password == null || password.isEmpty() || name == null || name.isEmpty() || surname == null || surname.isEmpty())
            throw new EmptyFieldException();
        if(userRepository.findByUsername(username).isEmpty()){
            throw new UserNotFoundException();
        }
        User user = new User(username, password, name, surname); //Stavi vo go baza!

        return user;
    }
}
