/*
Escribe un algoritmo que a partir del año de nacimiento introducido muestre como resultado si esa persona es mayor de edad o no.
*/

/**
 *
 * @author Maitane Navarro
 */

package tema2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Recoger año de nacimiento
        System.out.print("Introduce tu año de nacimiento: ");
        int nacimiento = teclado.nextInt();

        // Restar año actual (2026) menos el de nacimiento
        int edad = 2026 - nacimiento;

        //Abrimos if para decir si es mayor de edad o no
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

    }
}