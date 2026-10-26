/*
Pedir números hasta introducir un cero

El programa pide números continuamente. Cuando el usuario introduce un 0, termina y muestra la suma de los números anteriores, sin incluir el cero.
*/

package Pruebas_examen;

import java.util.Scanner;

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 1;
        int suma = 0;

        while (numero != 0) {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = entrada.nextInt();

            suma = suma + numero;
        }

        System.out.println("La suma total es: " + suma);

        entrada.close();
    }
}
