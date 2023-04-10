package com.Usherbrooke.COOproject.services;

import com.Usherbrooke.COOproject.model.Patient;

import java.util.ArrayList;

public interface interfacePacient {
    public ArrayList<Patient> getPatients();
    public void addpatient(Patient patient);
}
