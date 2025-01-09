package fr.morgan.brief15bibliotheque.repository;

import fr.morgan.brief15bibliotheque.model.Genre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
