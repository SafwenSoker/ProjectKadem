package com.pyxisit.kadem.entities;


import lombok.*;

import javax.persistence.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer etudiantId;

    private String prenomE;

    private String nomE;

    private Option opt;

    @ManyToOne
    private Department department;

    @OneToMany(mappedBy="etudiant")
    private List<Contrat> contrats;

    @ManyToMany
    private List<Equipe> equipes;
}