/*
Declara un entero llamado numero. Muestra «Positivo» si es mayor que cero, «Negativo» si es menor que cero y «Cero» si vale cero.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       // Pedir el número al usuario
       System.out.print("Introduce un número entero: ");
        int num = teclado.nextInt();
        if (num > 0){
            System.out.println("El número es positivo.");
        } else if (num < 0){
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero");
            }
    }
}
