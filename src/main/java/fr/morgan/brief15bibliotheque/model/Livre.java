package fr.morgan.brief15bibliotheque.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private String auteur;
    @Column(nullable = false)
    private boolean disponibilite;
    @ManyToMany
    @JoinTable(name = "livre_genre",
    joinColumns = @JoinColumn(name = "livre_id"),
    inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "livre_id")
    @JsonManagedReference(value ="livre")
    private List<Emprunt> Emprunts;
}
