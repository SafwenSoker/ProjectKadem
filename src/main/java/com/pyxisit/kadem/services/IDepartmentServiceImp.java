package com.pyxisit.kadem.services;

import com.pyxisit.kadem.entities.Department;
import com.pyxisit.kadem.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDepartmentServiceImp implements IDepartmentServices{

    @Autowired
    private DepartmentRepository departmentRepository;


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
}
