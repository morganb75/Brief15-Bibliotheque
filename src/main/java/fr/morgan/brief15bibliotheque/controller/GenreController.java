package fr.morgan.brief15bibliotheque.controller;

import fr.morgan.brief15bibliotheque.model.Genre;
import fr.morgan.brief15bibliotheque.repository.GenreRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genres")
public class GenreController {

    private final GenreRepository genreRepository;

    public GenreController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    @PostMapping
    public void creerGenre(Genre genre){
        genreRepository.save(genre);
    }
}
