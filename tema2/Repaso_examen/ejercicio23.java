/*
Adivinar un número con intentos limitados
Crea un programa que guarde un número secreto entre 1 y 20. El usuario tendrá un máximo de cinco intentos para adivinarlo. Después de cada intento, indica si el número secreto es mayor o menor. Si acierta, muestra un mensaje de felicitación.
Pista: utiliza Scanner, while, if y un contador para controlar los intentos.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int secreto = 12;
        int intento = 0;
        int contador = 0;

        while (contador < 5 && intento != secreto) {

            System.out.println("Adivina el número entre 1 y 20:");
            intento = teclado.nextInt();

            contador++;

            if (intento == secreto) {
                System.out.println("¡Felicidades! Has acertado.");
            } else if (intento < secreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }
        }

        if (intento != secreto) {
            System.out.println("Has agotado los cinco intentos.");
        }

        teclado.close();
    }
}