package com.pyxisit.kadem.services;

import com.pyxisit.kadem.entities.Contrat;
import com.pyxisit.kadem.entities.Etudiant;
import com.pyxisit.kadem.repositories.ContratRepository;
import com.pyxisit.kadem.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class IContratServiceImp implements IContratServices{
    @Autowired
    private ContratRepository contratRepository;

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public List<Contrat> retreiveAll() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return contratRepository.findById(idContrat).get();
    }

    @Override
    public void removeContrat(Integer idContrat) {
        contratRepository.deleteById(idContrat);
    }

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE){
        int nbreContratsActif = contratRepository.countByArchiveIsFalseAndEtudiantNomEAndEtudiantPrenomE(nomE,prenomE);
        Assert.isTrue(nbreContratsActif < 5, "This student is not elligible");

        Etudiant etudiant = etudiantRepository.findByNomEAndPrenomE(nomE, prenomE);
        Assert.notNull(etudiant,"student not found");

        ce.setEtudiant(etudiant);
        return null;
    }
}
