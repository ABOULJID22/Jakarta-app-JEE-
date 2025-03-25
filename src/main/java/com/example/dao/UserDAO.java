package com.example.dao;

import com.example.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("myappPU");

    public void saveUser(User user) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    public User findUserByEmail(String email) {
        EntityManager em = emf.createEntityManager();
        User user = em.createQuery("SELECT u FROM User u WHERE u.email = :email", User.class)
                      .setParameter("email", email)
                      .getSingleResult();
        em.close();
        return user;
    }
}
