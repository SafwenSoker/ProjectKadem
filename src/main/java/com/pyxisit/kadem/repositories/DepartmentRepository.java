package com.pyxisit.kadem.repositories;

import com.pyxisit.kadem.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    public List<Department> getDepartementsByUniversite(Integer idUniversite);
}
