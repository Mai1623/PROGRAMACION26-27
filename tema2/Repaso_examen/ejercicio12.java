/*
Calcular el factorial de un número

Pide un número entero entre 0 y 10 y calcula su factorial. El factorial de 5 es 5 × 4 × 3 × 2 × 1 = 120. Recuerda que el factorial de 0 es 1.

*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class ejercicio12 {
public static void main(String[] args) {
        // Creamos un Scanner para leer el teclado.
        Scanner teclado = new Scanner(System.in);
        // Pedimos al usuario que introduzca un número.
        System.out.print("Introduce un número: ");
        // Guardamos el número introducido.
        int numero = teclado.nextInt();
        // Inicializamos el factorial a 1.
        int factorial = 1;
        // Recorremos los números desde 1 hasta el número introducido.
        for (int i = 1; i <= numero; i++) {
            // Multiplicamos el factorial por el contador.
            factorial = factorial * i;
        }
        // Mostramos el resultado por pantalla.
        System.out.println("El factorial de " + numero + " es: " + factorial);

        teclado.close();
    }
}
