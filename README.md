Pas de problème ! Voici votre fichier `README.md` avec une mise en page améliorée pour GitHub :

```markdown
# Brief 15 - Création d'une application pour la gestion d'une bibliothèque

Lancer le projet Spring, cela donnera lieu à une migration qui va permettre de requêter les endpoints qui suivent (demandés dans le Brief) et qui sont fonctionnels.

## PARCOURS GESTION DES LIVRES
### ENDPOINTS
- **GET** `http://localhost:8080/api/livre/liste`  
  Récupération de la liste de tous les livres
- **GET** `http://localhost:8080/api/livre/disponibles`  
  Récupération de la liste des livres disponibles
- **POST** `http://localhost:8080/api/livre/liste`  
  Création d'un livre  
  **BODY de la Requête :**
  ```json
  {
    "titre": "test titre",
    "auteur": "test auteur",
    "disponibilite": true,
    "genres": [
      {
        "libelle": "test genre"
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
```

Vous pouvez copier ce contenu dans votre fichier `README.md` pour qu'il soit bien mis en page sur GitHub. 😊

Y a-t-il autre chose avec laquelle je peux vous aider ?