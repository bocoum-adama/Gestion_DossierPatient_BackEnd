package com.Usherbrooke.COOproject.services;

import com.Usherbrooke.COOproject.model.Authentifiquation;
import com.Usherbrooke.COOproject.model.DossierPatient;

import java.nio.file.AccessDeniedException;

public interface DossierPatientFactory {
    public DossierPatient consulterDossier(Authentifiquation authentifiquation) throws AccessDeniedException;
}
