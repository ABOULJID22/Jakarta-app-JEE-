package com.example.service;

import com.example.dao.CertificatDAO;
import com.example.model.Certificat;

public class CertificatService {

    private CertificatDAO certificatDAO = new CertificatDAO();

    public void enregistrerCertificat(Certificat certificat) {
        certificatDAO.saveCertificat(certificat);
    }
}
