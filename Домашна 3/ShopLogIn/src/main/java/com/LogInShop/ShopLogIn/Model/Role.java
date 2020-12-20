package com.LogInShop.ShopLogIn.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private int role;
    //@OneToMany(mappedBy = "roles")
    //private Set<User> users;

    public Role(int admin) {
        role = admin;
    }

    public Role() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    //public Set<User> getUsers() {
        //return users;
   // }

    //public void setUsers(Set<User> users) {
        //this.users = users;
    //}
}
