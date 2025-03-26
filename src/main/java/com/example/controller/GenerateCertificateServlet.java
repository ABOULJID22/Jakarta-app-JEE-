package com.example.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import com.example.model.Certificat;
import com.example.service.CertificatService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;

@WebServlet("/GenerateCertificateServlet")
public class GenerateCertificateServlet extends HttpServlet {
    private CertificatService certificatService = new CertificatService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupération des données du formulaire
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String annee = request.getParameter("annee");
        String theme = request.getParameter("theme");

        // Création et enregistrement du certificat
        Certificat certificat = new Certificat();
        certificat.setNom(nom);
        certificat.setPrenom(prenom);
        certificat.setAnnee(annee);
        certificat.setTheme(theme);
        certificatService.enregistrerCertificat(certificat);

        try {
            // Charger le fichier Jasper
            String jasperPath = getServletContext().getRealPath("/certificat.jasper");
            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(jasperPath);
            
            // Paramètres du certificat
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("NOM", nom);
            parameters.put("PRENOM", prenom);
            parameters.put("ANNEE", annee);
            parameters.put("THEME", theme);
            
            // Remplir le rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

            // Configurer la réponse HTTP pour afficher un fichier PDF
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "attachment; filename=certificat.pdf");
            OutputStream outStream = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, outStream);
            outStream.close();
        } catch (JRException e) {
            e.printStackTrace();
            response.getWriter().println("Erreur lors de la génération du certificat.");
        }
    }
}
