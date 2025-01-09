package fr.morgan.brief15bibliotheque.repository;

import fr.morgan.brief15bibliotheque.model.Emprunteur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprunteurRepository extends JpaRepository<Emprunteur, Long> {
}
