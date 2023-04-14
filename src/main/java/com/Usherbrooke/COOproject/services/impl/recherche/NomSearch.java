package com.Usherbrooke.COOproject.services.impl.recherche;

import com.Usherbrooke.COOproject.model.Patient;
import com.Usherbrooke.COOproject.services.RechercheDossierFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class NomSearch implements RechercheDossierFactory {

    @Override
    public List<Patient> recherche(List<Patient> patients, String keyword) {
        return patients.stream()
                .filter(patient -> patient.getNom().contains(keyword))
                .collect(Collectors.toList());
    }
}
