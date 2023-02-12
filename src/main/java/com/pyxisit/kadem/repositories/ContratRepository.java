package com.pyxisit.kadem.repositories;

import com.pyxisit.kadem.entities.Contrat;
import com.pyxisit.kadem.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {

}