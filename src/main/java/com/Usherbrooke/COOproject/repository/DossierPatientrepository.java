package com.Usherbrooke.COOproject.repository;

import com.Usherbrooke.COOproject.model.DossierPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierPatientrepository extends JpaRepository<DossierPatient, Long> {
}
