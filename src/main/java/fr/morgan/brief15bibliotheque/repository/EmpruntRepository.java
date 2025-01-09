package fr.morgan.brief15bibliotheque.repository;

import fr.morgan.brief15bibliotheque.model.Emprunt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
}
