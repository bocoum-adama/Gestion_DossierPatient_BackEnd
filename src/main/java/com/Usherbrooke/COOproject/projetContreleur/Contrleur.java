package com.Usherbrooke.COOproject.projetContreleur;

import com.Usherbrooke.COOproject.model.Patient;
import com.Usherbrooke.COOproject.services.impl.PatienService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class Contrleur {

    private final PatienService patienService;

    public Contrleur(PatienService patienService) {
        this.patienService = patienService;
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
}
