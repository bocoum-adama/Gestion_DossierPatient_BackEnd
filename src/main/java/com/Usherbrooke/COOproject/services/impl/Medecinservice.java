package com.Usherbrooke.COOproject.services.impl;

import com.Usherbrooke.COOproject.model.DossierPatient;
import com.Usherbrooke.COOproject.model.Medecin;
import com.Usherbrooke.COOproject.repository.Medcinrepository;
import com.Usherbrooke.COOproject.repository.DossierPatientrepository;
import com.Usherbrooke.COOproject.services.PersonneFactory;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Medecinservice implements PersonneFactory {

    private final DossierPatientrepository dossierPatientrepository;
    private final Medcinrepository medcinrepository;

    public Medecinservice(Medcinrepository medcinrepository,DossierPatientrepository dossierPatientrepository) {
        this.medcinrepository = medcinrepository;
        this.dossierPatientrepository= dossierPatientrepository;
    }

    @Override
    public void creeDossier(String nom, String prenom, Date datenaiss, String adresse, String tel, String mailinstit, String specialiter, Date datedouvertur, String etatpatient, String role) {
        Medecin medecin= new Medecin( nom,  prenom,  datenaiss,  adresse,  tel,  mailinstit,  specialiter);
        medcinrepository.save(medecin);
        dossierPatientrepository.save(new DossierPatient( datedouvertur, etatpatient));

    }

}
