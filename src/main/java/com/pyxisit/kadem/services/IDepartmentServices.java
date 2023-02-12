package com.pyxisit.kadem.services;

import com.pyxisit.kadem.entities.Department;

import java.util.List;

public interface IDepartmentServices {
    List<Department> retrieveAllDepartements();

    Department addDepartement (Department d);

    Department updateDepartement (Department d);

    Department retrieveDepartement (Integer idDepart);
}
