package fr.morgan.brief15bibliotheque.service.interfaces;

import fr.morgan.brief15bibliotheque.model.Emprunt;

import java.util.List;
import java.util.Optional;

public interface EmpruntService {

    void creerEmprunt(Emprunt emprunt);
    List<Emprunt> consulterEmprunts();
    Optional<Emprunt> consulterEmprunt(Long id);
    void effacerEmprunt(Long id);
    void modifierEmprunt(Long id);
}
