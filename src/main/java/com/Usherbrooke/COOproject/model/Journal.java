package com.Usherbrooke.COOproject.model;

import jakarta.persistence.*;

@Entity
public class Journal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "commentaire")
    private String commentaire;

    public Journal() {
    }

    public Journal(String commentaire) {
        this.commentaire = commentaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "id=" + id +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }
}
