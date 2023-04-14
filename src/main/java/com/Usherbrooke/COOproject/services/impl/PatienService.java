package com.Usherbrooke.COOproject.services.impl;

import com.Usherbrooke.COOproject.model.DossierPatient;
import com.Usherbrooke.COOproject.model.Patient;
import com.Usherbrooke.COOproject.repository.DossierPatientrepository;
import com.Usherbrooke.COOproject.repository.PatientRepository;
import com.Usherbrooke.COOproject.services.PersonneFactory;
import com.Usherbrooke.COOproject.services.interfacePacient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PatienService implements interfacePacient, PersonneFactory {

    private final PatientRepository patientrepository;
    private final DossierPatientrepository dossierPatientrepository;

    public PatienService(PatientRepository patientrepository, DossierPatientrepository dossierPatientrepository) {
        this.patientrepository = patientrepository;
        this.dossierPatientrepository = dossierPatientrepository;
    }

    @Override
    public ArrayList<Patient> getPatients(){
        ArrayList<Patient> patients=new ArrayList<>();
        patientrepository.findAll().forEach(patients::add);
        return patients;
    }
    @Override
    public void addpatient(Patient patient) {
        patientrepository.save(patient);
    }

    @Override
    public void creeDossier(String nom, String prenom, Date datenaiss, String adresse, String tel, String mailinstit, String specialiter, Date datedouvertur, String etatpatient, String role) {
        Patient patient=new Patient( nom, prenom,  datenaiss,  adresse,  tel);
        patientrepository.save(patient);
        dossierPatientrepository.save(new DossierPatient( datedouvertur, etatpatient));

    }
}
