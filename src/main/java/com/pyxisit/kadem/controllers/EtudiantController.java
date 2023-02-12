package com.pyxisit.kadem.controllers;

import com.pyxisit.kadem.entities.Etudiant;
import com.pyxisit.kadem.services.IEtudiantServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pyxisit.kadem.services.IEtudiantServices;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    @Autowired
    IEtudiantServices iEtudiantServices;
    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/")
    public String getAllEtudiants(){
        return "hello";
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiant(@PathVariable int id){
        return iEtudiantServices.getEtudiant(id);
    }

    @PostMapping("/")
    public void ajouterEtudiant(@RequestBody Etudiant etudiant){
        iEtudiantServices.ajouterEtudiant(etudiant);
    }
    @PutMapping("/")
    public void updateEtudiant(@RequestBody Etudiant etudiant){
        iEtudiantServices.updateEtudiant(etudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable int id){
        iEtudiantServices.deleteEtudiant(id);
    }

}
