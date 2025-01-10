package fr.morgan.brief15bibliotheque.service.interfaces;

import fr.morgan.brief15bibliotheque.model.Livre;

import java.util.List;

public interface LivreService {

    void creerLivre(Livre livre);
    List<Livre> listerLivres();
    List<Livre> consulterLivresDisponible();
}
