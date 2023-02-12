package com.pyxisit.kadem.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Universite{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepart;

    private String nomUniv;

    @OneToMany(mappedBy = "universite")
    private List<Department> departments;
}