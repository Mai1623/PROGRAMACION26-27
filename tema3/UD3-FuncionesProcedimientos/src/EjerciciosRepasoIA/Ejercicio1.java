/*
Ejercicio 1. Sumar dos números
Crea un programa que pida dos números por teclado y calcule su suma mediante un método.

Requisitos:
    Crear un método llamado sumar().
    Recibirá dos números enteros.
    Devolverá el resultado.
    Mostrar el resultado desde main().
*/
package EjerciciosRepasoIA;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Ejercicio1 {

    // Creamos el Scanner para leer datos por teclado
    static Scanner teclado = new Scanner(System.in);

    // Metodo para sumar dos numeros enteros
    public static int sumar(int a, int b) {

        // Devolvemos la suma de los dos numeros
        return a + b;
    }

    // Metodo principal del programa
    public static void main(String[] args) {

        // Pedimos el primer numero
        System.out.println("Introduce el primer numero:");

        // Guardamos el primer numero
        int num1 = teclado.nextInt();

        // Pedimos el segundo numero
        System.out.println("Introduce el segundo numero:");

        // Guardamos el segundo numero
        int num2 = teclado.nextInt();

        // Llamamos al metodo sumar y guardamos el resultado
        int resultado = sumar(num1, num2);

        // Mostramos el resultado
        System.out.println("El resultado de la suma es: " + resultado);

        // Cerramos el Scanner
        teclado.close();
    }
}

