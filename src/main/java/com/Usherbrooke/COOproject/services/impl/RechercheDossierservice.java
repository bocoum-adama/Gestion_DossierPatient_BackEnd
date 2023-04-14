package com.Usherbrooke.COOproject.services.impl;

import com.Usherbrooke.COOproject.model.Patient;
import com.Usherbrooke.COOproject.services.RechercheDossierFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RechercheDossierservice {
    @Autowired
    private RechercheDossierFactory patientSearchStrategy;

    public List<Patient> executeSearch(List<Patient> patients, String keyword) {
        return patientSearchStrategy.recherche(patients, keyword);
    }

    public void setPatientSearchStrategy(RechercheDossierFactory patientSearchStrategy) {
        this.patientSearchStrategy = patientSearchStrategy;
    }
}
