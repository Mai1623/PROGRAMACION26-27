/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 06_1DAW
 */

import java.util.Scanner;

// Creamos la clase principal
public class Ejercicio6a {

    // Metodo para pedir una nota
    public static double pedirNota(Scanner teclado, int examen) {
        System.out.println("Introduce la nota del examen " + examen + ":");
        return teclado.nextDouble();
    }

    // Metodo para calcular la media de las tres notas
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Metodo para mostrar las tres notas y la media
    public static void mostrarResultados(double nota1, double nota2, double nota3, double media) {
        System.out.println("\n--- INFORME ACADEMICO ---");
        System.out.println("Nota del examen 1: " + nota1);
        System.out.println("Nota del examen 2: " + nota2);
        System.out.println("Nota del examen 3: " + nota3);
        System.out.println("Nota media: " + media);
    }

    // Metodo para indicar si el alumno ha aprobado
    public static void mostrarResultado(double media) {
        if (media >= 5) {
            System.out.println("El alumno ha aprobado.");
        } else {
            System.out.println("El alumno ha suspendido.");
        }
    }

    // Metodo principal
    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner teclado = new Scanner(System.in);

        // Pedimos las tres notas
        double nota1 = pedirNota(teclado, 1);
        double nota2 = pedirNota(teclado, 2);
        double nota3 = pedirNota(teclado, 3);

        // Calculamos la media
        double media = calcularMedia(nota1, nota2, nota3);

        // Mostramos el informe academico
        mostrarResultados(nota1, nota2, nota3, media);

        // Mostramos si ha aprobado o suspendido
        mostrarResultado(media);

        // Cerramos el Scanner
        teclado.close();
    }
}
