package com.finki.ukim.dians.user_service_and_shopping_cart.dao;

import com.finki.ukim.dians.user_service_and_shopping_cart.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public class AccountDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Account findAccount(String userName){
        Session session = this.sessionFactory.getCurrentSession();
        return session.find(Account.class, userName);
    }
}
