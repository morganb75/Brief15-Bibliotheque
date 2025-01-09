package fr.morgan.brief15bibliotheque.service.interfaces;

import fr.morgan.brief15bibliotheque.model.Emprunteur;

import java.util.List;
import java.util.Optional;

public interface EmprunteurService {

    void creerEmprunteur(Emprunteur emprunteur);
    List<Emprunteur> listeEmprunteurs();
    Optional<Emprunteur> consulterEmprunteur(Long id);
    void supprimerEmprunteur(Long id);
    Emprunteur modifierEmprunteur(Emprunteur emprunteur);
}
