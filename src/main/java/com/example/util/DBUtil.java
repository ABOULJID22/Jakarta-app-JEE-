package com.example.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBUtil {
    
    private static final EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("myappPU");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
