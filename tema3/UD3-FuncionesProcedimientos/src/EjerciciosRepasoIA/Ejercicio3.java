/*
Ejercicio 3. Calcular el cuadrado de un número
Pide un número por teclado y calcula su cuadrado mediante una función.

Requisitos:
    Crear un método llamado calcularCuadrado().
    Recibirá un número entero.
    Devolverá el cuadrado del número.

*/
package EjerciciosRepasoIA;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Ejercicio3 {

    // Creamos el Scanner para leer datos por teclado
    static Scanner teclado = new Scanner(System.in);

    // Metodo para calcular el cuadrado de un numero
    public static int calcularCuadrado(int numero) {

        // Devolvemos el numero multiplicado por si mismo
        return numero * numero;
    }

    // Metodo principal del programa
    public static void main(String[] args) {

        // Pedimos un numero al usuario
        System.out.println("Introduce un numero:");

        // Guardamos el numero introducido
        int numero = teclado.nextInt();

        // Llamamos al metodo y guardamos el resultado
        int resultado = calcularCuadrado(numero);

        // Mostramos el resultado por pantalla
        System.out.println("El cuadrado del numero es: " + resultado);

        // Cerramos el Scanner
        teclado.close();
    }
}
