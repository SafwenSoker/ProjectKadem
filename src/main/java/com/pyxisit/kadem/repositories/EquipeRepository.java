package com.pyxisit.kadem.repositories;

import com.pyxisit.kadem.entities.Equipe;
import com.pyxisit.kadem.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
    List<Equipe> findByEtudiantsOptAndEtudiantsContratsSpecialite(Option op);
}
