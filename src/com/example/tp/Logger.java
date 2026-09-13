package com.example.tp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * Utilitaire pour enregistrer les erreurs dans un fichier de log.
 */
public class Logger {
    private static final String LOG_FILE = "error.log";

    /**
     * Écrit un message d'erreur dans le fichier error.log en mode append.
     * @param message Description de l'erreur
     */
    public static void logError(String message) {
        // Le second argument 'true' active le mode append
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {

            String timestamp = LocalDateTime.now().toString();
            pw.printf("[%s] ERROR: %s%n", timestamp, message);

        } catch (IOException e) {
            System.err.println("Impossible d'écrire dans le fichier de log : " + e.getMessage());
        }
    }
}