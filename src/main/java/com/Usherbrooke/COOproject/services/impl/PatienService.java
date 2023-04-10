package com.Usherbrooke.COOproject.services.impl;

import com.Usherbrooke.COOproject.model.Patient;
import com.Usherbrooke.COOproject.repository.PatientRepository;
import com.Usherbrooke.COOproject.services.interfacePacient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PatienService implements interfacePacient {

    private final PatientRepository patientrepository;

    public PatienService(PatientRepository patientrepository) {
        this.patientrepository = patientrepository;
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
}
