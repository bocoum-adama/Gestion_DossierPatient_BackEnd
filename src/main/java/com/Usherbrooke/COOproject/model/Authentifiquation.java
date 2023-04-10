package com.Usherbrooke.COOproject.model;

import jakarta.persistence.*;

@Entity
public class Authentifiquation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "login")
    private String login;
    @Column(name = "motsdepasse")
    private String Mdp;
    @Column(name = "statut")
    private String Statut;

    @JoinColumn(name = "dossierPatient_fk", referencedColumnName = "id")
    @ManyToOne
    private DossierPatient dossierPatient;

    public Authentifiquation(String login, String mdp, String statut) {
        this.login = login;
        Mdp = mdp;
        Statut = statut;
    }

    public Authentifiquation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return Mdp;
    }

    public void setMdp(String mdp) {
        Mdp = mdp;
    }

    public String getStatut() {
        return Statut;
    }

    public void setStatut(String statut) {
        Statut = statut;
    }

    @Override
    public String toString() {
        return "Authentifiquation{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", Mdp='" + Mdp + '\'' +
                ", Statut='" + Statut + '\'' +
                '}';
    }
}
