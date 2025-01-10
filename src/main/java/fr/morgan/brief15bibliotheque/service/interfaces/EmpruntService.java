package fr.morgan.brief15bibliotheque.service.interfaces;

import fr.morgan.brief15bibliotheque.model.Emprunt;

import java.util.List;

public interface EmpruntService {

    void creerEmprunt(Emprunt emprunt);
    List<Emprunt> consulterEmprunts();
    void modifierEmprunt(Long id);
}
