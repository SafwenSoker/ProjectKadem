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
public class Universite{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepart;

    private String nomUniv;

    @OneToMany(mappedBy = "universite")
    private List<Department> departments;
}