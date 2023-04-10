package com.Usherbrooke.COOproject.model;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

/**
 *
 * @author Dell
 */
@Entity
public class Agent extends Personne implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "role")
    private String Role;
    @Column(name = "mailinstit")
    private String Mailinstit;
    @ManyToMany
    Set<Intervantion> intervantionSet;

    public Agent() {
    }

    public Agent(String Role, String Mailinstit, String nom, String prenom, Date dateNaiss, String adresse, String tel) {
        super(nom, prenom, dateNaiss, adresse, tel);
        this.Role = Role;
        this.Mailinstit = Mailinstit;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getMailinstit() {
        return Mailinstit;
    }

    public void setMailinstit(String Mailinstit) {
        this.Mailinstit = Mailinstit;
    }

    @Override
    public String toString() {
        return "Agent{" + "Role=" + Role + ", Mailinstit=" + Mailinstit + '}';
    }



}