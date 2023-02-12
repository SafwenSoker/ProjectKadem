package com.pyxisit.kadem.entities;


import javax.persistence.*;

import java.util.List;

@Entity
public class Etudiant{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idEtudiant;

    private String prenomE;

    private String nomE;

    @Enumerated(EnumType.STRING)
    private Option option;

    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "etudiant")
    private List<Contrat> contrats;

    @ManyToMany(mappedBy="etudiants")
    private List<Equipe> equipes;
}