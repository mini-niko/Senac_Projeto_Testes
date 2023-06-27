package org.example;

public class PositivoOuNegativo {
    public static String avalia(double x) {
        if (x > 0) {
            return "Positivo";
        }
        else if (x < 0) {
            return "Negativo";
        }
        else {
            return "Zero";
        }
    };

}
