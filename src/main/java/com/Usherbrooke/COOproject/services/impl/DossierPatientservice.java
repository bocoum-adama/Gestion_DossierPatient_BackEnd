package com.Usherbrooke.COOproject.services.impl;

import com.Usherbrooke.COOproject.model.Authentifiquation;
import com.Usherbrooke.COOproject.model.DossierPatient;
import com.Usherbrooke.COOproject.repository.DossierPatientrepository;
import com.Usherbrooke.COOproject.services.DossierPatientFactory;
import org.springframework.stereotype.Service;

import java.nio.file.AccessDeniedException;

@Service
public class DossierPatientservice implements DossierPatientFactory {

    private final DossierPatientrepository dossierPatientrepository;

    public DossierPatientservice(DossierPatientrepository dossierPatientrepository) {
        this.dossierPatientrepository = dossierPatientrepository;
    }

    @Override
    public DossierPatient consulterDossier(Authentifiquation authentifiquation) throws AccessDeniedException {
        if (authentifiquation.getLogin().equals("admin") && authentifiquation.getMdp().equals("password")) {
            return authentifiquation.getDossierPatient();
        } else {
            throw new AccessDeniedException("Accès refusé.");
        }
    }
}
