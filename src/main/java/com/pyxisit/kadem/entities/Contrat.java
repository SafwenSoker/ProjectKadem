package com.pyxisit.kadem.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContrat;

    private Date dateDebutContrat;

    private Date dateFinContrat;

    private Specialite specialite;

    private Boolean archive;

    private Integer montantContrat;

    @ManyToOne
    private Etudiant etudiant;
}