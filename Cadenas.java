/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Javi
 */
public class Cadenas {

    private Ordenador ordenador;
    private List<String> cadenita;           //La Cadenita de Carmen
    private Random randomizador;
    private final String[] palabras = {"Ira", "Ji", "Guajira", "Ana", "A", "Guantana", "Mera"};

    public Cadenas() {
        cadenita = new ArrayList<>();
        randomizador = new Random();

        ordenador = new Ordenador() {
            @Override
            public void sortByAlphabetic() {
                    cadenita.sort(new Comparator<String>() {
                        @Override
                        public int compare(String t, String t1) {
                            return t.compareTo(t1);
                        }
                    });
            }

            @Override
            public void sortByLenght() {
                cadenita.sort(new Comparator<String>() {
                    @Override
                    public int compare(String t, String t1) {
                            return Integer.compare(t.length(), t1.length());
                    }
                });
            }
        };
        generarDesorden();
    }

    public void generarDesorden() {
        cadenita.removeAll(cadenita);
        for (int i = 0; i < 10; i++) {
            String palabra = "";
            for (int j = 0; j < 3; j++) {
                palabra = palabra.concat(palabras[randomizador.nextInt(palabras.length)]);
            }
            cadenita.add(palabra);
        }
    }

    public void lambdaAlphabetic() {
        Collections.sort(cadenita, (String t, String t1) -> t.compareTo(t1));
    }

    public void lambdaLenght() {
        Collections.sort(cadenita, (a, b) -> Integer.compare(a.length(), b.length()));
    }

    public void referenceAlphabetic() {
        Collections.sort(cadenita, Comparator.comparing(Object::toString));
    }

    public void referenceLenght() {
        Collections.sort(cadenita, Comparator.comparingInt(String::length));
    }

    public Ordenador getOrdenador() {
        return ordenador;
    }

    @Override
    public String toString() {
        return "Cadenas{" + cadenita.toString() + "}";
    }

}
