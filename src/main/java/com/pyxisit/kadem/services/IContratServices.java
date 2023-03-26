package com.pyxisit.kadem.services;


import com.pyxisit.kadem.entities.Contrat;

import java.util.List;

public interface IContratServices {

    List<Contrat> retreiveAll();

    Contrat updateContrat(Contrat ce);

    Contrat addContrat(Contrat ce);

    Contrat retrieveContrat(Integer idContrat);

    void removeContrat(Integer idContrat);

    Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE);
}
