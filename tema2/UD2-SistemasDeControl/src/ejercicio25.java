/*
Factorial: Calcular el factorial de un número introducido por el usuario
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class ejercicio25 {
    // Método principal donde comienza el programa.
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

