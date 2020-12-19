package com.LogInShop.ShopLogIn.Repository;

import com.LogInShop.ShopLogIn.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
