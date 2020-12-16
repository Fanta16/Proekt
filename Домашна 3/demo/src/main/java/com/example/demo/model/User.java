package com.example.demo.model;

import jdk.jfr.DataAmount;
import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name = "shop-user")
public class User {
    @Id
    private String Name;
    private String Surname;
    private String Username;
    private String Password;


    public User(String username, String password,String name, String surname) {
        Name = name;
        Surname = surname;
        Username = username;
        Password = password;
    }

    public User(){}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    /*@ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }*/
}
