package com.Usherbrooke.COOproject.model;

import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public abstract class Personne {

    @Column(name = "nom")
    private String Nom;
    @Column(name = "prenom")
    private String Prenom;
    @Column(name = "datenaiss")
    @Temporal(TemporalType.DATE)
    private Date DateNaiss;
    @Column(name = "adresse")
    private String Adresse;
    @Column(name = "tel")
    private String Tel;

    public Personne(String nom, String prenom, Date dateNaiss, String adresse, String tel) {
        Nom = nom;
        Prenom = prenom;
        DateNaiss = dateNaiss;
        Adresse = adresse;
        Tel = tel;
    }

    public Personne() {
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public Date getDateNaiss() {
        return DateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        DateNaiss = dateNaiss;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    @Override
    public String toString() {
        return "Personne{" +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", DateNaiss=" + DateNaiss +
                ", Adresse='" + Adresse + '\'' +
                ", Tel='" + Tel + '\'' +
                '}';
    }
}
