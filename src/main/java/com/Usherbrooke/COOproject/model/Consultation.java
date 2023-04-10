package com.Usherbrooke.COOproject.model;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
public class Consultation {

    public Consultation() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "compteRendue")
    private String compteRendue;
    @Column(name = "prescription")
    private String prescription;
    @Column(name = "dateconsultation")
    private Date dateconsultation;

    @JoinColumn(name = "medecin_fk", referencedColumnName = "id")
    @ManyToOne
    private Medecin medecin;
    @JoinColumn(name = "diagnostique_fk", referencedColumnName = "id")
    @ManyToOne
    private Diagnostique diagnostique;
    @JoinColumn(name = "dossierPatient_fk", referencedColumnName = "id")
    @ManyToOne
    private DossierPatient dossierPatient;

    @OneToMany(mappedBy = "id")
    private Collection<Intervantion> intervantionCollection;

    public Consultation(String compteRendue, String prescription, Date dateconsultation) {
        this.compteRendue = compteRendue;
        this.prescription = prescription;
        this.dateconsultation = dateconsultation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompteRendue() {
        return compteRendue;
    }

    public void setCompteRendue(String compteRendue) {
        this.compteRendue = compteRendue;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public Date getDateconsultation() {
        return dateconsultation;
    }

    public void setDateconsultation(Date dateconsultation) {
        this.dateconsultation = dateconsultation;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", compteRendue='" + compteRendue + '\'' +
                ", prescription='" + prescription + '\'' +
                ", dateconsultation=" + dateconsultation +
                '}';
    }
}
