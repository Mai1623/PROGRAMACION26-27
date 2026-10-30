/*
Contar números pares

Muestra todos los números pares del 2 al 50.

Pista: puedes aumentar el contador de 2 en 2 o utilizar %.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i = i + 2){
            System.out.println(i);
        }
}
}