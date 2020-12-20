package com.LogInShop.ShopLogIn.Repository;

import com.LogInShop.ShopLogIn.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByRole(final int role);
    Role deleteByRole(int role);
}
