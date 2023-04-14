package com.Usherbrooke.COOproject.repository;

import com.Usherbrooke.COOproject.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Agentrepository extends JpaRepository<Agent, Long> {
}
