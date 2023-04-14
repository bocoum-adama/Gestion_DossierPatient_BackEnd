package com.Usherbrooke.COOproject.repository;

import com.Usherbrooke.COOproject.model.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Medcinrepository extends JpaRepository<Medecin, Long> {
}
