package com.pyxisit.kadem.services;

import com.pyxisit.kadem.entities.Universite;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IUniversiteServices {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (Integer idUniversite);

    public void assignUniversiteToDepartment(Integer idUniversite, Integer idDepartment);

    public Map<String, Float> getMontantContratEntreDeuxDate(int idUniv, Date startDate, Date endDate);
}
