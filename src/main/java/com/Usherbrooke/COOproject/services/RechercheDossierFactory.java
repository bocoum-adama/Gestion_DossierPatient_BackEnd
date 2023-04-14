package com.Usherbrooke.COOproject.services;

import com.Usherbrooke.COOproject.model.Patient;

import java.util.List;

public interface RechercheDossierFactory {
    List<Patient> recherche(List<Patient> patients, String keyword);
}
