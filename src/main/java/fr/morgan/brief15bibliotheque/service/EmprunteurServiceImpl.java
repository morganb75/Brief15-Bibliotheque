package fr.morgan.brief15bibliotheque.service;

import fr.morgan.brief15bibliotheque.model.Emprunteur;
import fr.morgan.brief15bibliotheque.repository.EmprunteurRepository;
import fr.morgan.brief15bibliotheque.repository.GenreRepository;
import fr.morgan.brief15bibliotheque.service.interfaces.EmprunteurService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmprunteurServiceImpl implements EmprunteurService {

    private final EmprunteurRepository emprunteurRepository;

    public EmprunteurServiceImpl(GenreRepository genreRepository, EmprunteurRepository emprunteurRepository) {
        this.emprunteurRepository = emprunteurRepository;
    }

    @Override
    public void creerEmprunteur(Emprunteur emprunteur) {
        emprunteurRepository.save(emprunteur);
    }

    @Override
    public List<Emprunteur> listeEmprunteurs() {
        return emprunteurRepository.findAll();
    }
}
