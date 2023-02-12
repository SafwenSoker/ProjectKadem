package com.pyxisit.kadem.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Equipe{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipe;

    private String nomEquipe;

    private Niveau niveau;

    @OneToOne
    private DetailEquipe detailEquipe;

    @ManyToMany
    private List<Etudiant> etudiants;
}