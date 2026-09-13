# Exercice 1 : Calculatrice Sécurisée

##  Objectif
Illustrer la gestion des exceptions en Java en implémentant une classe `Calculator` capable d'effectuer les opérations arithmétiques de base, et en capturant les erreurs (notamment la division par zéro) via un bloc `try-catch-finally`.

##  Structure du Projet
- **Package :** `com.example.tp`
- **Classes :**
  - `Calculator.java` : Classe fournissant les opérations arithmétiques de base (`add`, `sub`, `mul`, `div`) et levant une `ArithmeticException` si le dénominateur est nul.
  - `MainCalc.java` : Programme de test illustrant la capture de l'exception et l'utilisation du bloc `finally`.

## 🛠️ Compilation et Exécution

Depuis le répertoire `src/` :

```bash
javac com/example/tp/Calculator.java com/example/tp/MainCalc.java
java com.example.tp.MainCalc
Exercice 2 : `README_EX2.md`

```markdown
# Exercice 2 : Lecture d'un Fichier de Nombres

##  Objectif
Apprendre à lire un fichier texte ligne par ligne à l'aide de `BufferedReader`, convertir son contenu en entiers (`Integer.parseInt`) et gérer de manière robuste les exceptions d'entrées/sorties (`IOException`) ainsi que les erreurs de format (`NumberFormatException`).

##  Structure du Projet
- **Package :** `com.example.tp`
- **Classes & Fichiers :**
  - `FileUtil.java` : Classe utilitaire contenant la méthode statique `readNumbers(String path)` utilisant le `try-with-resources`.
  - `MainFile.java` : Programme de test exécutant la lecture et l'affichage des valeurs reçues.
  - `numbers.txt` : Fichier de données placé à la racine du projet contenant un entier par ligne.

## 🛠️ Compilation et Exécution

Depuis le répertoire `src/` (avec `numbers.txt` à la racine du projet) :
Exercice 3 : `README_EX3.md`

```markdown
# Exercice 3 : Validation d'Utilisateur avec Exception Personnalisée

##  Objectif
Définir une exception personnalisée vérifiée (`InvalidUserException` héritant de `Exception`) pour valider les attributs d'un objet métier (`User`) et forcer l'appelant à gérer proprement les erreurs de validation.

##  Structure du Projet
- **Package :** `com.example.tp`
- **Classes :**
  - `InvalidUserException.java` : Exception personnalisée checked avec message explicite.
  - `User.java` : Classe métier représentant un utilisateur (nom, âge) avec une méthode `validate()` déclenchant une exception si le nom est vide ou si l'âge est inférieur à 18 ans.
  - `MainUser.java` : Programme de test parcourant un tableau de `User` pour valider chaque instance.

## 🛠️ Compilation et Exécution

Depuis le répertoire `src/` :

```bash
javac com/example/tp/*.java
java com.example.tp.MainUser
```
<img width="1597" height="642" alt="EX4tp9" src="https://github.com/user-attachments/assets/4ebd8a6a-39f8-470a-82c2-4813adea64e6" />
<img width="1271" height="375" alt="EX3tp9" src="https://github.com/user-attachments/assets/c69c8d44-1d72-4586-aea7-9b61c5d21045" />
<img width="1092" height="182" alt="EX2tp9" src="https://github.com/user-attachments/assets/24b6ba8e-7a0c-4024-9854-a1e62f51cc39" />
<img width="1310" height="397" alt="EX1tp9" src="https://github.com/user-attachments/assets/72b6f105-f0f0-4903-beb5-7e9d5555635f" />



```bash
javac com/example/tp/FileUtil.java com/example/tp/MainFile.java
java -cp . com.example.tp.MainFile
