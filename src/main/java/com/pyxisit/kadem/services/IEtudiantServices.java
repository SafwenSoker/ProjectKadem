package com.pyxisit.kadem.services;

import com.pyxisit.kadem.entities.Etudiant;

import java.util.List;

public interface IEtudiantServices {
    void ajouterEtudiant(Etudiant e);

    void updateEtudiant(Etudiant e);

    List<Etudiant> getAllEtudiants();

    Etudiant getEtudiant(Integer id);

    void deleteEtudiant(Integer id);

    void assignEtudiantToDepartment(Integer etudiantId, Integer departmentId);

    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);

    List<Etudiant> getEtudiantsByDepartment(Integer departmentId);

}