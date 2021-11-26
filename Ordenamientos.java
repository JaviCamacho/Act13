/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientos;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ordenamientos {

    private static Cadenas cadenitas;
    private static Scanner entrada;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        cadenitas = new Cadenas();

        while (true) {
            System.out.println("Ordenamiento de Cadenas");
            System.out.println("By Javier Camacho\n");
            System.out.println("Menu:");
            System.out.println("1) Mostrar Lista");
            System.out.println("2) Generar nueva Lista");
            System.out.println("3) Ordenar Lambda Alfabetico");
            System.out.println("4) Ordenar Lambda Tamaño");
            System.out.println("5) Ordenar Por Referencia Alfabetico");
            System.out.println("6) Ordenar Por Referencia Tamaño");
            System.out.println("7) Ordenar Por Clase Anonima Alfabetico");
            System.out.println("8) Ordenar Por Clase Anonima Tamaño");
            System.out.println("9) Salir");

            switch (entrada.nextInt()) {
                case 1:
                    System.out.println(cadenitas.toString());
                    break;
                case 2:
                    cadenitas.generarDesorden();
                    System.out.println("Se ha generado nueva lista");
                    break;
                case 3:
                    cadenitas.lambdaAlphabetic();
                    System.out.println("Se ordeno la lista alfabeticamente");
                    break;
                case 4:
                    cadenitas.lambdaLenght();
                    System.out.println("Se ordeno la lista por tamaño");
                    break;
                case 5:
                    cadenitas.referenceAlphabetic();
                    System.out.println("Se ordeno la lista alfabeticamente");
                    break;
                case 6:
                    cadenitas.referenceLenght();
                    System.out.println("Se ordeno la lista por tamaño");
                    break;
                case 7:
                    cadenitas.getOrdenador().sortByAlphabetic();
                    System.out.println("Se ordeno la lista alfabeticamente");
                    break;
                case 8:
                    cadenitas.getOrdenador().sortByLenght();
                    System.out.println("Se ordeno la lista por tamaño");
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Respuesta incorrecta");
                    break;
            }
            System.out.println("\n\n\n");
        }
    }

}
