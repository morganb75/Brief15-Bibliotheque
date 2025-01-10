package fr.morgan.brief15bibliotheque.service.interfaces;

import fr.morgan.brief15bibliotheque.model.Genre;

import java.util.List;

public interface GenreService {

    void crerGenre(Genre genre);
    List<Genre> listerGenres();
}
