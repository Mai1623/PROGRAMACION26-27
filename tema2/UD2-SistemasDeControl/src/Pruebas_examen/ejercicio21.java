/*
Contar los números pares e impares
Pide al usuario 10 números enteros. Al terminar, muestra cuántos números son pares y cuántos son impares.
Pista: utiliza un for, dos contadores independientes y el operador % para comprobar si cada número es par o impar.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce un numero: ");
            int num = teclado.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);

        teclado.close();
    }
}
