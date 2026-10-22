
/*
 * Factorial: Calcular el factorial de un número introducido por el usuario.
 */

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class ejercicio25While {
    public static void main(String[] args) {
        // Creamos un Scanner para leer el teclado.
        Scanner teclado = new Scanner(System.in);
        // Pedimos al usuario que introduzca un número.
        System.out.print("Introduce un número: ");
        // Guardamos el número introducido.
        int numero = teclado.nextInt();
        // Inicializamos el factorial a 1.
        int factorial = 1;
        // Inicializamos el contador a 1.
        int i = 1;
        // Repetimos mientras el contador sea menor o igual al número.
        while (i <= numero) {
            // Multiplicamos el factorial por el contador.
            factorial = factorial * i;
            // Aumentamos el contador en una unidad.
            i++;
        }
        // Mostramos el resultado por pantalla.
        System.out.println("El factorial de " + numero + " es: " + factorial);
        // Cerramos el Scanner.
        teclado.close();
    }
}
