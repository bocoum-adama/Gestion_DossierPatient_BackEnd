package com.Usherbrooke.COOproject.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.*;

/**
 *
 * @author Dell
 */
@Entity
public class DossierPatient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "DateDouvertur")
    @Temporal(TemporalType.DATE)
    private Date DateDouvertur;
    @Column(name = "DateFermeture")
    @Temporal(TemporalType.DATE)
    private Date DateFermeture;
    @Column(name = "EtatPatient")
    public String EtatPatient;

    @OneToMany(mappedBy = "id")
    private Collection<Authentifiquation> authentifiquationCollection;
    @OneToMany(mappedBy = "id")
    private Collection<Consultation> consultationCollection;

    public DossierPatient() {
    }

    public DossierPatient(Date DateDouvertur, String EtatPatient) {
        this.DateDouvertur = DateDouvertur;
        this.EtatPatient = EtatPatient;
    }

    public Date getDateDouvertur() {
        return DateDouvertur;
    }

    public void setDateDouvertur(Date DateDouvertur) {
        this.DateDouvertur = DateDouvertur;
    }

    public Date getDateFermeture() {
        return DateFermeture;
    }

    public void setDateFermeture(Date DateFermeture) {
        this.DateFermeture = DateFermeture;
    }

    public String getEtatPatient() {
        return EtatPatient;
    }

    public void setEtatPatient(String EtatPatient) {
        this.EtatPatient = EtatPatient;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DossierPatient{" + "id=" + id + ", DateDouvertur=" + DateDouvertur + ", DateFermeture=" + DateFermeture + ", EtatPatient=" + EtatPatient + '}';
    }


}

