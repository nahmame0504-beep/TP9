package com.example.tp;

/**
 * Test de la journalisation des erreurs dans error.log.
 */
public class MainLogger {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test 1 : Division par zéro
        try {
            calc.div(10, 0);
        } catch (ArithmeticException ex) {
            // Remplacement de System.err par Logger.logError
            Logger.logError("Calculatrice : " + ex.getMessage());
        }

        // Test 2 : Lecture d'un fichier introuvable
        FileUtil.readNumbers("fichier_inexistant.txt"); 

        // Test 3 : Validation d'un utilisateur invalide
        User invalidUser = new User("Bob", 15);
        try {
            invalidUser.validate();
        } catch (InvalidUserException ex) {
            Logger.logError("Validation utilisateur : " + ex.getMessage());
        }

        System.out.println("Opérations terminées. Consultez le fichier error.log.");
    }
}