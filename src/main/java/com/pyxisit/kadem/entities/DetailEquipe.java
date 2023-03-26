package com.pyxisit.kadem.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class DetailEquipe{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer salle;

    private String thematique;

    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;

}