package com.Usherbrooke.COOproject.model;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
public class Diagnostique {

    public Diagnostique() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "conclusion")
    private String conclusion;
    @Column(name = "dateDiagnostique")
    private Date dateDiagnostique;

    @OneToMany(mappedBy = "id")
    private Collection<Consultation> consultationCollection;

    public Diagnostique(String conclusion, Date dateDiagnostique) {
        this.conclusion = conclusion;
        this.dateDiagnostique = dateDiagnostique;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public Date getDateDiagnostique() {
        return dateDiagnostique;
    }

    public void setDateDiagnostique(Date dateDiagnostique) {
        this.dateDiagnostique = dateDiagnostique;
    }

    @Override
    public String toString() {
        return "Diagnostique{" +
                "id=" + id +
                ", conclusion='" + conclusion + '\'' +
                ", dateDiagnostique=" + dateDiagnostique +
                '}';
    }
}
