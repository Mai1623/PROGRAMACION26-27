/*
Adivinar un número secreto

Guarda un número secreto entre 1 y 20. El usuario debe intentar adivinarlo hasta acertar.

Después de cada intento, indica si el número secreto es mayor o menor que el número introducido.

Pista: combina Scanner, while e if.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int secreto = 12;
        int num = 0;

        while (num != secreto) {
            System.out.print("Adivina el número entre 1 y 20: ");
            num = teclado.nextInt();

            if (num < secreto) {
                System.out.println("El número secreto es mayor.");
            } else if (num > secreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Correcto! Has acertado.");
            }
        }

        teclado.close();
    }
}