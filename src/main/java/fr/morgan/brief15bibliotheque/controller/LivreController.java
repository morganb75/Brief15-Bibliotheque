package fr.morgan.brief15bibliotheque.controller;

import fr.morgan.brief15bibliotheque.model.Livre;
import fr.morgan.brief15bibliotheque.service.interfaces.LivreService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livre")
public class LivreController {

    private final LivreService livreService;

    public LivreController(LivreService livreService) {
        this.livreService = livreService;
    }

    @GetMapping("/liste")
    public List<Livre> getAllLivres() {
        return livreService.listerLivres();
    }

    @GetMapping("/disponibles")
    public List<Livre> getLivresDisponibles(){
        return livreService.consulterLivresDisponible();
    }

    @PostMapping
    public void addLivre(@RequestBody Livre livre) {
        livreService.creerLivre(livre);
    }
}
