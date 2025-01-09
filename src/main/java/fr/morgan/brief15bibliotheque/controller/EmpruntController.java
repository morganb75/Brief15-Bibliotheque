package fr.morgan.brief15bibliotheque.controller;

import fr.morgan.brief15bibliotheque.model.Emprunt;
import fr.morgan.brief15bibliotheque.repository.EmpruntRepository;
import fr.morgan.brief15bibliotheque.service.interfaces.EmpruntService;
import fr.morgan.brief15bibliotheque.service.interfaces.EmprunteurService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emprunts")
public class EmpruntController {

    private final EmpruntService empruntService;

    public EmpruntController(EmpruntService empruntService) {
        this.empruntService = empruntService;
    }

    @GetMapping
    public List<Emprunt> getAllEmprunts() {
        return empruntService.consulterEmprunts();
    }

    @PostMapping("/emprunt")
    public void creerEmprunt(@RequestBody Emprunt emprunt){
        empruntService.creerEmprunt(emprunt);
    }

    @PutMapping("/retour/{id}")
    public void modifierEmprunt(@PathVariable long id){
        empruntService.modifierEmprunt(id);
    }

}
