package com.pyxisit.kadem.controllers;

import com.pyxisit.kadem.entities.Contrat;
import com.pyxisit.kadem.services.IContratServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/contrat")
public class ContratController {
    @Autowired
    private IContratServices iContratService;

    @GetMapping("/")
    public List<Contrat> getAllContrats(){
        return iContratService.retreiveAll();
    }

    @GetMapping("/{id}")
    public Contrat getContrat(@PathVariable int id){
        return iContratService.retrieveContrat(id);
    }

    @PostMapping("/")
    public Contrat ajouterContrat(@RequestBody Contrat contrat){
        return iContratService.addContrat(contrat);
    }

    @PutMapping("/")
    public Contrat updateContrat(@RequestBody Contrat contrat){
        return iContratService.updateContrat(contrat);
    }

    @DeleteMapping("/{id}")
    public void deleteContrat(@PathVariable int id){
        iContratService.removeContrat(id);
    }

}
