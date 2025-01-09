package fr.morgan.brief15bibliotheque.service;

import fr.morgan.brief15bibliotheque.model.Genre;
import fr.morgan.brief15bibliotheque.repository.GenreRepository;
import fr.morgan.brief15bibliotheque.service.interfaces.GenreService;

import java.util.List;
import java.util.Optional;

public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public void crerGenre(Genre genre) {
        genreRepository.save(genre);
    }

    @Override
    public List<Genre> listerGenres() {
        return genreRepository.findAll();
    }

    @Override
    public Optional<Genre> consulterGenre(Long id) {
        return genreRepository.findById(id);
    }

    @Override
    public void supprimerGenre(Long id) {
        genreRepository.deleteById(id);
    }

    @Override
    public Genre modifierGenre(Long id) {
        return null;
    }
}
