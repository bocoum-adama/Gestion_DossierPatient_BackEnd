package com.Usherbrooke.COOproject.model;

import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
 *
 * @author Dell
 */
@Entity
public class Patient extends Personne implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "dossierPatient_fk")
    private DossierPatient dossierPatient;

    public Patient() {
    }

    public Patient(String nom, String prenom, Date dateNaiss, String adresse, String tel) {
        super(nom, prenom, dateNaiss, adresse, tel);
    }


}
