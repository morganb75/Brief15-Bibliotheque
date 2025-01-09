package fr.morgan.brief15bibliotheque.service.interfaces;

import fr.morgan.brief15bibliotheque.model.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService {

    void crerGenre(Genre genre);
    List<Genre> listerGenres();
    Optional<Genre> consulterGenre(Long id);
    void supprimerGenre(Long id);
    Genre modifierGenre(Long id);
}
