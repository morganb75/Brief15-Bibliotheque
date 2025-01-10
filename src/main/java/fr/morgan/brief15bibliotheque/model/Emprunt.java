package fr.morgan.brief15bibliotheque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime dateEmprunt;
    private LocalDateTime dateRetour;
    @ManyToOne
    @JsonBackReference(value = "livre")
    private Livre livre;
    @ManyToOne
    @JsonBackReference(value="emprunteur")
    private Emprunteur emprunteur;

    public Emprunt(Livre livre, Emprunteur emprunteur) {
        this.livre = livre;
        this.emprunteur = emprunteur;
    }
}


