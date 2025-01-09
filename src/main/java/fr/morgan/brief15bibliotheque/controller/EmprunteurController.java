package fr.morgan.brief15bibliotheque.controller;

import fr.morgan.brief15bibliotheque.model.Emprunteur;
import fr.morgan.brief15bibliotheque.service.interfaces.EmprunteurService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class EmprunteurController {

    private final EmprunteurService emprunteurService;

    public EmprunteurController(EmprunteurService emprunteurService) {
        this.emprunteurService = emprunteurService;
    }

    @GetMapping
    public List<Emprunteur> getAllUsers(){
        return emprunteurService.listeEmprunteurs();
    }

    @PostMapping
    public void creerEmprunteur(@RequestBody Emprunteur emprunteur){
        emprunteurService.creerEmprunteur(emprunteur);
    }
}
