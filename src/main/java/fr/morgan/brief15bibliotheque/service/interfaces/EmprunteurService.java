package fr.morgan.brief15bibliotheque.service.interfaces;

import fr.morgan.brief15bibliotheque.model.Emprunteur;

import java.util.List;

public interface EmprunteurService {

    void creerEmprunteur(Emprunteur emprunteur);
    List<Emprunteur> listeEmprunteurs();
}
