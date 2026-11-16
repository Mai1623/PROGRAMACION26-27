/*
 Analizador de posiciones
Ampliación
Crea un programa que:
    Solicite al usuario el tamaño de un array.
    Cree un array de ese tamaño.
    Permita introducir sus elementos.
    Solicite una posición.
    Muestre el valor almacenado en dicha posición.
    Controle que la posición sea válida.
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array:");
        int tamano = teclado.nextInt();

        int[] numeros = new int[tamano];

        // Introducir los números
        for (int i = 0; i < tamano; i++) {
            System.out.println("Introduce un número:");
            numeros[i] = teclado.nextInt();
        }

        // Pedir una posición
        System.out.println("Introduce una posición:");
        int posicion = teclado.nextInt();

        // Comprobar si la posición es válida
        if (posicion >= 0 && posicion < tamano) {
            System.out.println("El valor es: " + numeros[posicion]);
        } else {
            System.out.println("La posición no es válida");
        }

    }
}
