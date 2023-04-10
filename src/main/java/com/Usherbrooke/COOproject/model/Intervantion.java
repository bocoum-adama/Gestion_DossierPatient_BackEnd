package com.Usherbrooke.COOproject.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Intervantion {

    public Intervantion() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "typeItervantion")
    private String typeItervantion;
    @Column(name = "StatueItervantion")
    private String StatueItervantion;
    @Column(name = "dateIntervantion")
    private Date dateIntervantion;

    @JoinColumn(name = "consultation_fk", referencedColumnName = "id")
    @ManyToOne
    private Consultation consultation;
    @ManyToMany
    Set<Agent> agentSet;

    public Intervantion(String typeItervantion, String statueItervantion, Date dateIntervantion) {
        this.typeItervantion = typeItervantion;
        StatueItervantion = statueItervantion;
        this.dateIntervantion = dateIntervantion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeItervantion() {
        return typeItervantion;
    }

    public void setTypeItervantion(String typeItervantion) {
        this.typeItervantion = typeItervantion;
    }

    public String getStatueItervantion() {
        return StatueItervantion;
    }

    public void setStatueItervantion(String statueItervantion) {
        StatueItervantion = statueItervantion;
    }

    public Date getDateIntervantion() {
        return dateIntervantion;
    }

    public void setDateIntervantion(Date dateIntervantion) {
        this.dateIntervantion = dateIntervantion;
    }

    @Override
    public String toString() {
        return "Intervantion{" +
                "id=" + id +
                ", typeItervantion='" + typeItervantion + '\'' +
                ", StatueItervantion='" + StatueItervantion + '\'' +
                ", dateIntervantion=" + dateIntervantion +
                '}';
    }
}
