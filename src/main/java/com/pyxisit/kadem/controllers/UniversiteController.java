package com.pyxisit.kadem.controllers;

import com.pyxisit.kadem.entities.Universite;
import com.pyxisit.kadem.services.IUniversiteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {
    @Autowired
    private IUniversiteServices iUniversiteServices;

    @GetMapping("/")
    public List<Universite> getAllUniversities(){
        return iUniversiteServices.retrieveAllUniversites();
    }

    @GetMapping("/{id}")
    public Universite getById(@PathVariable Integer id){
        return iUniversiteServices.retrieveUniversite(id);
    }

    @PostMapping("/")
    public Universite ajouterUniversite(@RequestBody Universite universite){
        return iUniversiteServices.addUniversite(universite);
    }

    @PutMapping("/")
    public Universite updateUniversite(@RequestBody Universite universite){
        return iUniversiteServices.updateUniversite(universite);
    }
}
