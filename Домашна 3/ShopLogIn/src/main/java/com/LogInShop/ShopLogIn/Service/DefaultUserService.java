package com.LogInShop.ShopLogIn.Service;

import com.LogInShop.ShopLogIn.Model.Exceptions.InvalidUserCredentialsException;
import com.LogInShop.ShopLogIn.Model.Exceptions.UserAlreadyExistsException;
import com.LogInShop.ShopLogIn.Model.User;
import com.LogInShop.ShopLogIn.Repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service("UserService")
public class DefaultUserService implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void register(User user) throws UserAlreadyExistsException {
        if(checkIfUserExist(user.getUsername())){
            throw new UserAlreadyExistsException("User already exists for this username");
        }
        User userEntity = new User();
        BeanUtils.copyProperties(user, userEntity);
        encodePassword(user, userEntity);
        userRepository.save(userEntity);
    }

    @Override
    public boolean checkIfUserExist(String username) {
        return userRepository.findByUsername(username) != null;
    }

    @Override
    public User getUserByUsername(String username) throws InvalidUserCredentialsException {
        User user= userRepository.findByUsername(username);
        if(user == null){
            throw new InvalidUserCredentialsException("User not found!");
        }
        return user;
    }

    private void encodePassword(User user, User userEntity) {
        userEntity.setPassword(passwordEncoder.encode(user.getPassword()));
    }
}
