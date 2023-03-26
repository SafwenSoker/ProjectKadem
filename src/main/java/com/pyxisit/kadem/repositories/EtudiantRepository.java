
package com.pyxisit.kadem.repositories;

import com.pyxisit.kadem.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    Etudiant findByNomEAndPrenomE(String nom, String prenom);
}