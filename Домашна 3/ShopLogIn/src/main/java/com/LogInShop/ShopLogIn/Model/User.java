package com.LogInShop.ShopLogIn.Model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "theusers")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotEmpty(message = "{registration.validation.name}")
    private String name;
    @NotEmpty(message = "{registration.validation.surname}")
    private String surname;
    @Column(unique = true)
    private String username;
    @NotEmpty(message = "{registration.validation.password}")
    private String password;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Role> roles;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User nextuser = (User) obj;
        return Objects.equals(username, nextuser.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
