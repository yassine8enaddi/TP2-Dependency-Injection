package com.example.tp2.model;

public class Student {
    private Integer CNE;
    private String nom;
    private String prenom;
    private String filiere;

    public Student(Integer CNE, String nom, String prenom, String filiere) {
        this.CNE = CNE;
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
    }

    public Integer getCNE() {
        return CNE;
    }

    public void setCNE(Integer CNE) {
        this.CNE = CNE;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}
