package com.example.dao;

import com.example.model.Certificat;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CertificatDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("myappPU");

    public void saveCertificat(Certificat certificat) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(certificat);
        em.getTransaction().commit();
        em.close();
    }
}
