package com.pyxisit.kadem.controllers;

import com.pyxisit.kadem.entities.Department;
import com.pyxisit.kadem.services.IDepartmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departement")
public class DepartmentController {
    @Autowired
    private IDepartmentServices iDepartmentServices;

    @GetMapping("/")
    public List<Department> getaAllDepartments(){
        return iDepartmentServices.retrieveAllDepartements();
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable Integer id){
        return iDepartmentServices.retrieveDepartement(id);
    }

    @PostMapping("/")
    public Department ajouterDepartment(@RequestBody Department department){
        return iDepartmentServices.addDepartement(department);
    }

    @PutMapping("/updateDepartment")
    public Department updateDepartment(@RequestBody Department department) {
        return iDepartmentServices.updateDepartement(department);
    }




}
