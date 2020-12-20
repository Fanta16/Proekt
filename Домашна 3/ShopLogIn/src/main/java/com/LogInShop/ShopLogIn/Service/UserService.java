package com.LogInShop.ShopLogIn.Service;

import com.LogInShop.ShopLogIn.Model.Exceptions.InvalidUserCredentialsException;
import com.LogInShop.ShopLogIn.Model.Exceptions.UserAlreadyExistsException;
import com.LogInShop.ShopLogIn.Model.User;

public interface UserService {
    void register(final User user) throws UserAlreadyExistsException;
    boolean checkIfUserExist(final String username);
    User getUserByUsername(final String username) throws InvalidUserCredentialsException;
}
