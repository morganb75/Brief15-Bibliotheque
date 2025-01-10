package fr.morgan.brief15bibliotheque.service;

import fr.morgan.brief15bibliotheque.model.Emprunt;
import fr.morgan.brief15bibliotheque.model.Emprunteur;
import fr.morgan.brief15bibliotheque.model.Livre;
import fr.morgan.brief15bibliotheque.repository.EmpruntRepository;
import fr.morgan.brief15bibliotheque.repository.EmprunteurRepository;
import fr.morgan.brief15bibliotheque.repository.LivreRepository;
import fr.morgan.brief15bibliotheque.service.interfaces.EmpruntService;

import java.lang.module.FindException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmpruntServiceImpl implements EmpruntService {

    private final EmpruntRepository empruntRepository;
    private final LivreRepository livreRepository;
    private final EmprunteurRepository emprunteurRepository;

    public EmpruntServiceImpl(EmpruntRepository empruntRepository, LivreRepository livreRepository, EmprunteurRepository emprunteurRepository) {
        this.empruntRepository = empruntRepository;
        this.livreRepository = livreRepository;
        this.emprunteurRepository = emprunteurRepository;
    }

    @Override
    public void creerEmprunt(Emprunt emprunt) {
        LocalDateTime dateEmprunt = LocalDateTime.now();
        Livre livre = (livreRepository.findById(emprunt.getLivre().getId()))
                .orElseThrow(() -> new FindException("livre non repertorié"));
        Emprunteur emprunteur = emprunteurRepository.findById(emprunt.getEmprunteur().getId())
                .orElseThrow(() -> new FindException("user non enregistré"));
        livre.setDisponibilite(false);
        emprunt.setDateEmprunt(dateEmprunt);
        emprunt.setLivre(livre);
        emprunt.setEmprunteur(emprunteur);
        empruntRepository.save(emprunt);
    }

    @Override
    public List<Emprunt> consulterEmprunts() {
        return empruntRepository.findAll();
    }

    @Override
    public void modifierEmprunt(Long id) {
        Emprunt emprunt = empruntRepository.findById(id)
                .orElseThrow(() -> new FindException("pas d'emprunt qui correspond à la recherche"));
        Livre livre = emprunt.getLivre();
        livre.setDisponibilite(true);
        emprunt.setDateRetour(LocalDateTime.now());
        empruntRepository.save(emprunt);
    }
}
