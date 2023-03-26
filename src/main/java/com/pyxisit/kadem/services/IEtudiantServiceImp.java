package com.pyxisit.kadem.services;

import com.pyxisit.kadem.entities.Contrat;
import com.pyxisit.kadem.entities.Department;
import com.pyxisit.kadem.entities.Equipe;
import com.pyxisit.kadem.repositories.ContratRepository;
import com.pyxisit.kadem.repositories.DepartmentRepository;
import com.pyxisit.kadem.repositories.EquipeRepository;
import com.pyxisit.kadem.entities.Etudiant;
import com.pyxisit.kadem.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class IEtudiantServiceImp implements IEtudiantServices {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private ContratRepository contratRepository;
    @Autowired
    private EquipeRepository equipeRepository;


    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiantRepository.save(e);
    }

    @Override
    public void updateEtudiant(Etudiant e) {

    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiant(Integer id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void assignEtudiantToDepartment(Integer etudiantId, Integer departmentId) {
        Department department = departmentRepository.findById(departmentId).orElse(null);
        Assert.isNull(department, "Department not found");
        Etudiant etudiant  = etudiantRepository.findById(etudiantId).orElse(null);
        Assert.isNull(etudiant,"Etudiant not found");
        department.getEtudiants().add(etudiant);
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Assert.isNull(contrat,"Contrat not found");
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        Assert.isNull(equipe, "Equipe not found");
        equipe.getEtudiants().add(e);
        contrat.setEtudiant(e);
        return e;
    }

    public List<Etudiant> getEtudiantsByDepartment(Integer departmentId){
        Department department = departmentRepository.findById(departmentId).orElse(null);
        Assert.isNull(department,"Department not found");
        // etudiantRepository.findByDepartment(departmentId);
        return department.getEtudiants();

    }



}
