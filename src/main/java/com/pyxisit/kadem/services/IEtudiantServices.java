package com.pyxisit.kadem.services;

import com.pyxisit.kadem.entities.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IEtudiantServices {
    public void ajouterEtudiant(Etudiant e);

    public void updateEtudiant(Etudiant e);

    public List<Etudiant> getAllEtudiants();

    public Etudiant getEtudiant(Integer id);

    public void deleteEtudiant(Integer id);
}