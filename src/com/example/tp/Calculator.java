package com.example.tp;

/**
 * Fournit les opérations arithmétiques de base.
 * La méthode div lève une ArithmeticException en cas de division par zéro.
 */
public class Calculator {

    /** Additionne deux nombres. */
    public double add(double a, double b) {
        return a + b;
    }

    /** Soustrait b de a. */
    public double sub(double a, double b) {
        return a - b;
    }

    /** Multiplie deux nombres. */
    public double mul(double a, double b) {
        return a * b;
    }

    /**
     * Divise a par b.
     * @throws ArithmeticException si b vaut zéro
     */
    public double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return a / b;
    }
}