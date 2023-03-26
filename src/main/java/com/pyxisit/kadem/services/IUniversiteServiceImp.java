package com.pyxisit.kadem.services;

import com.pyxisit.kadem.entities.Department;
import com.pyxisit.kadem.entities.Universite;
import com.pyxisit.kadem.repositories.DepartmentRepository;
import com.pyxisit.kadem.repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class IUniversiteServiceImp implements IUniversiteServices{

    @Autowired
    private UniversiteRepository universiteRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    @Transactional
    public void assignUniversiteToDepartment(Integer idUniversite, Integer idDepartment) {
        Department department = departmentRepository.findById(idDepartment).orElse(null);
        Assert.isNull(department, "No such department");
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Assert.isNull(universite, "Universite not found");
        universite.getDepartments().add(department);
        //2eme methode
        /*List<Department> departments = universite.getDepartments();
        departments.add(department);
        universite.setDepartments(departments);*/

    }

    @Override
    public Map<String, Float> getMontantContratEntreDeuxDate(int idUniv, Date startDate, Date endDate) {
        Universite universite = universiteRepository.findById(idUniv).orElse(null);
        Assert.isNull(universite, "Universite not found");
        List<Department> departments = universite.getDepartments();
        return null;

    }


}
