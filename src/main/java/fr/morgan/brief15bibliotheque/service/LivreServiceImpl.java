package fr.morgan.brief15bibliotheque.service;

import fr.morgan.brief15bibliotheque.model.Livre;
import fr.morgan.brief15bibliotheque.repository.GenreRepository;
import fr.morgan.brief15bibliotheque.repository.LivreRepository;
import fr.morgan.brief15bibliotheque.service.interfaces.LivreService;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class LivreServiceImpl implements LivreService {

    private final LivreRepository livreRepository;

    public LivreServiceImpl(LivreRepository livreRepository, GenreRepository genreRepository) {
        this.livreRepository = livreRepository;
    }

    @Override
    public void creerLivre(Livre livre) {
        livreRepository.save(livre);
    }

    @Override
    public List<Livre> listerLivres() {
        return livreRepository.findAll();
    }

    @Override
    public List<Livre> consulterLivresDisponible() {
        return livreRepository.findAll().stream()
                .filter(Objects::nonNull)
                .filter(Livre::isDisponibilite)
                .collect(Collectors.toList());
    }
}
