/*
Mostrar una cuenta atrás
Pide al usuario un número entero positivo y muestra una cuenta atrás desde ese número hasta cero. Al terminar, muestra un mensaje indicando que la cuenta atrás ha finalizado.
Pista: utiliza un while y el operador -- para restar una unidad en cada repetición.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 0;

        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();

        while (num >= 0) {
            System.out.println(num);
            num--;
        }

        System.out.println("¡Cuenta atrás finalizada!");

        teclado.close();
    }
}

