package com.pyxisit.kadem.services;

import com.pyxisit.kadem.entities.Equipe;

import java.util.List;

public interface IEquipeServices {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);
}
