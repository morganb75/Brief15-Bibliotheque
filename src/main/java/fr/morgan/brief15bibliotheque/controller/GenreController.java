package fr.morgan.brief15bibliotheque.controller;

import fr.morgan.brief15bibliotheque.model.Genre;
import fr.morgan.brief15bibliotheque.service.interfaces.GenreService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genres")
public class GenreController {

private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreService.listerGenres();
    }

    @PostMapping
    public void creerGenre(Genre genre){
        genreService.crerGenre(genre);
    }
}
