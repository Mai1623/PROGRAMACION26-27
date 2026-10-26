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
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        if (numero >= 0 && numero <= 10) {
    int factorial = 1;

    for (int i = 1; i <= numero; i++) {
        factorial = factorial * i;
    }

    System.out.println("El factorial de " + numero + " es: " + factorial);
} else {
    System.out.println("Introduce un número entre 0 y 10.");
}
}
}
