package com.pyxisit.kadem.repositories;

import com.pyxisit.kadem.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {

    int countByArchiveIsFalseAndEtudiantNomEAndEtudiantPrenomE(String etudiant_nomE, String etudiant_prenomE);

}