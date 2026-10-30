/*
Pide al usuario 10 números enteros. Al terminar, muestra cuántos son positivos, cuántos negativos y cuántos son cero.
Por ejemplo, si introduce 4, -2, 0, 7, -5, 1, 0, -3, 8, 2, debe mostrar:
text
Positivos: 5
Negativos: 3
Ceros: 2
Pista: utiliza un for, tres contadores y una estructura if, else if, else.
*/
package Pruebas_examen;

/**
 *
 * @author 06_1DAW
 */

import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce un número:");
            int num = teclado.nextInt();

            if (num < 0) {
                negativos++;
            } else if (num > 0) {
                positivos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        teclado.close();
    }
}
