package com.iam;

import java.util.Date;

public class Student {
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Filiere filiere;
    


    public Student(int id, String nom, String prenom, Date dateNaissance, Filiere filiere) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.filiere = filiere;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;

    }


    @Override
    public String toString() {
        return "Student{"+"id="+ id +"nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", filiere=" + filiere + '}';
    }



}
