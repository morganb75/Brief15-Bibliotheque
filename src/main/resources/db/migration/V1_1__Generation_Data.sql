-- Fichier de migration qui met à disposition un jeu de données pour pouvoir ensuite passer par l'API
-- pour emprunter des livres

-- Generation Data emprunteurs
INSERT INTO emprunteur(nom, prenom, email)
VALUES ('Dupont', 'Jean', 'jean.dupont@example.com'),
       ('Martin', 'Marie', 'marie.martin@example.com'),
       ('Bernard', 'Luc', 'luc.bernard@example.com'),
       ('Dubois', 'Sophie', 'sophie.dubois@example.com'),
       ('Thomas', 'Pierre', 'pierre.thomas@example.com'),
       ('Robert', 'Julie', 'julie.robert@example.com'),
       ('Richard', 'Paul', 'paul.richard@example.com'),
       ('Petit', 'Claire', 'claire.petit@example.com'),
       ('Durand', 'Marc', 'marc.durand@example.com'),
       ('Leroy', 'Emma', 'emma.leroy@example.com');

-- Création des genres
INSERT INTO Genre (libelle) VALUES ('Science Fiction');
INSERT INTO Genre (libelle) VALUES ('Fantasy');
INSERT INTO Genre (libelle) VALUES ('Mystery');
INSERT INTO Genre (libelle) VALUES ('Romance');
INSERT INTO Genre (libelle) VALUES ('Thriller');

-- Création des livres
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('1984', 'George Orwell', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Dune', 'Frank Herbert', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Le Seigneur des Anneaux', 'J.R.R. Tolkien', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Harry Potter à l\''école des sorciers', 'J.K. Rowling', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Le Meurtre de Roger Ackroyd', 'Agatha Christie', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Les Misérables', 'Victor Hugo', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Le Comte de Monte-Cristo', 'Alexandre Dumas', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('La Peste', 'Albert Camus', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('L\''Étranger', 'Albert Camus', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Cyrano de Bergerac', 'Edmond Rostand', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Le Petit Prince', 'Antoine de Saint-Exupéry', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Madame Bovary', 'Gustave Flaubert', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Les Fleurs du mal', 'Charles Baudelaire', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('À la recherche du temps perdu', 'Marcel Proust', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('L\''Éducation sentimentale', 'Gustave Flaubert', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Bel-Ami', 'Guy de Maupassant', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Germinal', 'Émile Zola', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Notre-Dame de Paris', 'Victor Hugo', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('Le Rouge et le Noir', 'Stendhal', true);
INSERT INTO Livre (titre, auteur, disponibilite) VALUES ('La Chartreuse de Parme', 'Stendhal', true);

-- Association des livres avec les genres
INSERT INTO livre_genre (livre_id, genre_id) VALUES (1, 1);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (2, 1);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (3, 2);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (4, 2);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (5, 3);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (6, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (7, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (8, 5);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (9, 5);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (10, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (11, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (12, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (13, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (14, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (15, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (16, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (17, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (18, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (19, 4);
INSERT INTO livre_genre (livre_id, genre_id) VALUES (20, 4);

