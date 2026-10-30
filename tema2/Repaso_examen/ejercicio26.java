/*
Analizar las cifras de un número
Pide al usuario un número entero positivo y calcula cuántas cifras tiene, la suma de sus cifras y el número escrito al revés.
Por ejemplo, si introduce 352, el programa debe mostrar:
    • Número de cifras: 3.
    • Suma de las cifras: 10.
    • Número al revés: 253.
Pista: utiliza un while, el operador % 10 para obtener la última cifra y la división entera entre 10 para eliminarla. Para invertir el número, multiplica el resultado parcial por 10 y suma la nueva cifra.

*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = teclado.nextInt();

        int cifras = 0;
        int suma = 0;
        int invertido = 0;

        while (numero > 0) {
            int cifra = numero % 10;
            cifras++;
            suma = suma + cifra;
            invertido = invertido * 10 + cifra;

            numero = numero / 10;
        }

        System.out.println("Número de cifras: " + cifras);
        System.out.println("Suma de las cifras: " + suma);
        System.out.println("Número al revés: " + invertido);

        teclado.close();
    }
}
