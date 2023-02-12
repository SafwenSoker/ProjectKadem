package com.pyxisit.kadem.entities;

import javax.persistence.*;

@Entity
public class DetailEquipe{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer salle;

    private String thematique;

    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalle() {
        return salle;
    }

    public void setSalle(Integer salle) {
        this.salle = salle;
    }

    public String getThematique() {
        return thematique;
    }

    public void setThematique(String thematique) {
        this.thematique = thematique;
    }
}