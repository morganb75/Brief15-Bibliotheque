package fr.morgan.brief15bibliotheque.service;

import fr.morgan.brief15bibliotheque.model.Genre;
import fr.morgan.brief15bibliotheque.repository.GenreRepository;
import fr.morgan.brief15bibliotheque.service.interfaces.GenreService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
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
}
