package com.pyxisit.kadem.services;

import com.pyxisit.kadem.entities.Department;
import com.pyxisit.kadem.entities.Universite;
import com.pyxisit.kadem.repositories.DepartmentRepository;
import com.pyxisit.kadem.repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class IDepartmentServiceImp implements IDepartmentServices{


    @Autowired
    private UniversiteRepository universiteRepository;


    @Override
    public List<Department> retrieveAllDepartements() {
        return null;
    }

    @Override
    public Department addDepartement(Department d) {
        return null;
    }

    @Override
    public Department updateDepartement(Department d) {
        return null;
    }

    @Override
    public Department retrieveDepartement(Integer idDepart) {
        return null;
    }

    @Override
    public List<Department> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Assert.isNull(universite,"University not found");
        return universite.getDepartments();
    }
}
