package com.pyxisit.kadem.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepart;

    private String nomDepart;

    @ManyToOne
    private Universite universite;

    @OneToMany(mappedBy = "department")
    private List<Etudiant>etudiants;
}