package fr.morgan.brief15bibliotheque.service.interfaces;

import fr.morgan.brief15bibliotheque.model.Livre;

import java.util.List;
import java.util.Optional;

public interface LivreService {

    void creerLivre(Livre livre);
    List<Livre> listerLivres();
    Optional<Livre> consulterLivre(Long id);
    void supprimerLivre(Long id);
    List<Livre> consulterLivresDisponible();
}
