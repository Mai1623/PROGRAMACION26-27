/*
¡Ordena tu código! De programa monolítico a modular
Situación: Calculadora de notas

Un profesor necesita un programa que permita introducir las calificaciones de un alumno en tres exámenes y obtener un pequeño informe académico.
Se proporciona un programa Java que realiza todas las operaciones dentro del método main.
Aunque funciona correctamente, presenta un problema: todo el código está concentrado en un único método, lo que dificulta su lectura, mantenimiento y reutilización.
Tu misión es refactorizar el programa, dividiendo su funcionalidad en métodos independientes.

*/

/**
 * @author Maitane Navarro
 */



import java.util.Scanner;

public class Ejercicio6 {

    // Creamos el Scanner para introducir datos por teclado
    static Scanner teclado = new Scanner(System.in);

    // Metodo para leer una nota por teclado
    public static double leerNota() {
        return teclado.nextDouble();
    }

    // Metodo para calcular la media de las tres notas
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    // Metodo para obtener la nota mas alta
    public static double obtenerNotaMaxima(double nota1, double nota2, double nota3) {

        double maxima;

        if (nota1 >= nota2 && nota1 >= nota3) {
            maxima = nota1;
        } else if (nota2 >= nota1 && nota2 >= nota3) {
            maxima = nota2;
        } else {
            maxima = nota3;
        }

        return maxima;
    }

    // Metodo para comprobar si el alumno ha aprobado
    public static boolean estaAprobado(double media) {
        return media >= 5;
    }

    // Metodo para mostrar el informe final
    public static void mostrarResultados(double media, double maxima, boolean aprobado) {

        System.out.println("\n--- INFORME ACADEMICO ---");
        System.out.println("Media: " + media);
        System.out.println("Nota maxima: " + maxima);

        if (aprobado) {
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: SUSPENSO");
        }
    }

    // Metodo principal del programa
    public static void main(String[] args) {

        // Pedimos las tres notas
        System.out.print("Introduce la primera nota: ");
        double nota1 = leerNota();

        System.out.print("Introduce la segunda nota: ");
        double nota2 = leerNota();

        System.out.print("Introduce la tercera nota: ");
        double nota3 = leerNota();

        // Calculamos la media
        double media = calcularMedia(nota1, nota2, nota3);

        // Obtenemos la nota maxima
        double maxima = obtenerNotaMaxima(nota1, nota2, nota3);

        // Comprobamos si ha aprobado
        boolean aprobado = estaAprobado(media);

        // Mostramos el informe final
        mostrarResultados(media, maxima, aprobado);

        // Cerramos el Scanner
        teclado.close();
    }
}
