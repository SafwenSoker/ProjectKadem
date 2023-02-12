package com.pyxisit.kadem.services;


import com.pyxisit.kadem.entities.Contrat;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IContratServices {

    public List<Contrat> retreiveAll();

    public Contrat updateContrat(Contrat ce);

    public Contrat addContrat(Contrat ce);

    public Contrat retrieveContrat(Integer idContrat);

    public void removeContrat(Integer idContrat);
}
