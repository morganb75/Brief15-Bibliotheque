
# Brief 15 - Création d'une API pour la gestion d'une bibliothèque

Dans un premier temps, creer une base de données POSTGRESQL nommée: db_brief15, sinon ajuster la config de votre BDD dans le .yml
Lancer le projet Spring, cela donnera lieu à une migration qui va permettre de requêter
les endpoints qui suivent (demandés dans le Brief) et qui sont fonctionnels.

## PARCOURS GESTION DES LIVRES
### ENDPOINTS
- **GET** `http://localhost:8080/api/livre/liste`  
  Récupération de la liste de tous les livres
- **GET** `http://localhost:8080/api/livre/disponibles`  
  Récupération de la liste des livres disponibles
- **POST** `http://localhost:8080/api/livre`  
  Création d'un livre  
  **BODY de la Requête :**
  ```json
  {
    "titre": "test titre",
    "auteur": "test auteur",
    "disponibilite": true,
    "genres": [
      {
        "id":3,
        "libelle": "Mystery"
      }
    ],
    "emprunts": []
  }
  ```

## PARCOURS GESTION DES GENRES
### ENDPOINTS
- **GET** `http://localhost:8080/api/genres`  
  Récupération de la liste des genres
- **POST** `http://localhost:8080/api/genres`  
  Création d'un genre  
  **BODY de la Requête :**
  ```json
  {
    "libelle": "nouveau genre"
  }
  ```

## PARCOURS GESTION DES EMPRUNTEURS
### ENDPOINTS
- **GET** `http://localhost:8080/api/users`  
  Récupération de la liste des emprunteurs
- **POST** `http://localhost:8080/api/users`  
  Création d'un emprunteur  
  **BODY de la Requête :**
  ```json
  {
    "nom": "testnom",
    "prenom": "testprenom",
    "email": "nom.prenom@email.com",
    "emprunts": []
  }
  ```

## PARCOURS GESTION DES EMPRUNTS
### ENDPOINTS
- **GET** `http://localhost:8080/api/emprunts`  
  Récupération de la liste des emprunts
- **POST** `http://localhost:8080/api/emprunts/emprunt`  
  Création d'un emprunt  
  **BODY de la Requête :**
  ```json
  {
    "livre": {
      "id": 11,
      "auteur": "Antoine de Saint-Exupéry",
      "titre": "Le Petit Prince"
    },
    "emprunteur": {
      "id": 5,
      "nom": "Thomas",
      "prenom": "Pierre",
      "email": "pierre.thomas@example.com"
    }
  }
  ```
- **PUT** `http://localhost:8080/api/emprunts/retour/{id}`  
  Retour d'emprunt
