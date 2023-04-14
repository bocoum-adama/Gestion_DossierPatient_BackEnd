package com.Usherbrooke.COOproject.services.impl;

import com.Usherbrooke.COOproject.model.Agent;
import com.Usherbrooke.COOproject.model.DossierPatient;
import com.Usherbrooke.COOproject.repository.Agentrepository;
import com.Usherbrooke.COOproject.repository.DossierPatientrepository;
import com.Usherbrooke.COOproject.services.PersonneFactory;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Agentsevice implements PersonneFactory {

    private final DossierPatientrepository dossierPatientrepository;
    private final Agentrepository agentrepository;
    public Agentsevice(DossierPatientrepository dossierPatientrepository, Agentrepository agentrepository) {
        this.dossierPatientrepository = dossierPatientrepository;
        this.agentrepository = agentrepository;
    }


    @Override
    public void creeDossier(String nom, String prenom, Date datenaiss, String adresse, String tel, String mailinstit, String specialiter, Date datedouvertur, String etatpatient, String role) {
        Agent agent=new Agent( role, mailinstit,  nom,  prenom,  datenaiss,  adresse,  tel);
        dossierPatientrepository.save(new DossierPatient( datedouvertur, etatpatient));

    }
}
