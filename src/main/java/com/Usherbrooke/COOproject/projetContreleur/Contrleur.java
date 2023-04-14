package com.Usherbrooke.COOproject.projetContreleur;

import com.Usherbrooke.COOproject.model.Authentifiquation;
import com.Usherbrooke.COOproject.model.DossierPatient;
import com.Usherbrooke.COOproject.model.Patient;
import com.Usherbrooke.COOproject.services.RechercheDossierFactory;
import com.Usherbrooke.COOproject.services.impl.DossierPatientservice;
import com.Usherbrooke.COOproject.services.impl.PatienService;
import com.Usherbrooke.COOproject.services.impl.RechercheDossierservice;
import com.Usherbrooke.COOproject.services.impl.recherche.NomSearch;
import com.Usherbrooke.COOproject.services.impl.recherche.PrenomSearch;
import com.Usherbrooke.COOproject.services.impl.recherche.TelSearch;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/agent")
public class Contrleur {

    private final PatienService patienService;
    private final DossierPatientservice dossierPatientservice;
    private final RechercheDossierservice rechercheDossierservice;

    public Contrleur(PatienService patienService, DossierPatientservice dossierPatientservice, RechercheDossierservice patientSearchStrategy) {
        this.patienService = patienService;
        this.dossierPatientservice = dossierPatientservice;
        rechercheDossierservice = patientSearchStrategy;
    }

    @GetMapping
    public ArrayList<Patient> getpatient(){
        return patienService.getPatients();
    }

    @PostMapping
    public Patient savepatient(@RequestBody Patient patient){
        patienService.addpatient(patient);
        return patient;
    }
    @GetMapping("/dossier-patient")
    public DossierPatient consulterDossier(@RequestBody Authentifiquation authentifiquation) throws AccessDeniedException {
        DossierPatient dossierPatient = dossierPatientservice.consulterDossier(authentifiquation);
        return dossierPatient;
    }

    @GetMapping("/search")
    public List<Patient> search(@RequestParam String searchType, @RequestParam String keyword) {
        // technique de base de refactoring
        RechercheDossierFactory patientSearchStrategy = getPatientSearchStrategy(searchType);
        rechercheDossierservice.setPatientSearchStrategy(patientSearchStrategy);
        List<Patient> patients = patienService.getPatients();
        return rechercheDossierservice.executeSearch(patients, keyword);
    }
    // technique de base de refactoring
    private RechercheDossierFactory getPatientSearchStrategy(String searchType) {
        switch (searchType) {
            case "Nom":
                return new NomSearch();
            case "Prenom":
                return new PrenomSearch();
            case "Tel":
                return new TelSearch();
            default:
                throw new IllegalArgumentException("Invalid search type");
        }
    }
}
