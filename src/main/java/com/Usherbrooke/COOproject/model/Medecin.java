package com.Usherbrooke.COOproject.model;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.*;


@Entity
public class Medecin extends Personne implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "mailinstit")
    private String Mailinstit;
    @Column(name = "specialiter")
    private String Specialiter;

    @OneToMany(mappedBy = "id")
    private Collection<Consultation> consultationCollection;

    public Medecin() {
    }

    public Medecin(String nom, String prenom, Date dateNaiss, String adresse, String tel, String mailinstit, String specialiter) {
        super(nom, prenom, dateNaiss, adresse, tel);
        Mailinstit = mailinstit;
        Specialiter = specialiter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMailinstit() {
        return Mailinstit;
    }

    public void setMailinstit(String Mailinstit) {
        this.Mailinstit = Mailinstit;
    }

    public String getSpecialiter() {
        return Specialiter;
    }

    public void setSpecialiter(String Specialiter) {
        this.Specialiter = Specialiter;
    }

    @Override
    public String toString() {
        return "Medecin{" + " Mailinstit=" + Mailinstit + ", Specialiter=" + Specialiter + '}';
    }

}