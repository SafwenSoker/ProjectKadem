package com.pyxisit.kadem.controllers;

import com.pyxisit.kadem.entities.Equipe;
import com.pyxisit.kadem.services.IEquipeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipe")
public class EquipeController {
    @Autowired
    private IEquipeServices iEquipeServices;

    @GetMapping("/")
    public List<Equipe> getAllEquipes(){
        return iEquipeServices.retrieveAllEquipes();
    }

    @GetMapping("/{id}")
    public Equipe getById(@PathVariable Integer id){
        return iEquipeServices.retrieveEquipe(id);
    }

    @PostMapping("/")
    public Equipe getById(@RequestBody Equipe equipe){
        return iEquipeServices.addEquipe(equipe);
    }

    @PutMapping("/")
    public Equipe updateEquipe(@RequestBody Equipe equipe){
        return iEquipeServices.addEquipe(equipe);
    }

}
