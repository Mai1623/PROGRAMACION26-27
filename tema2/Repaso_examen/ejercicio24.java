/*
Comprobar si un número es primo
Pide al usuario un número entero e indica si es primo o no.
Recuerda que un número primo es mayor que 1 y solo es divisible exactamente entre 1 y él mismo.
Pista: utiliza un for para comprobar si el número es divisible entre otros números desde 2 hasta el número anterior. Utiliza % para comprobar el resto de la división.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int num = teclado.nextInt();

        boolean primo = true;
        if (num <= 1) {
            primo = false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }

        teclado.close();
    }
}
