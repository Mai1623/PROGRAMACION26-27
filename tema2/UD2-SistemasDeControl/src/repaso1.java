/*
Escribe un algoritmo que a partir del año de nacimiento introducido muestre como resultado si esa persona es mayor de edad o no.

*/

/**
 *
 * @author Maitane
 */

import java.util.Scanner;


public class repaso1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nacimiento, edad;

        System.out.print("Introduce tu año de nacimiento: ");
        nacimiento = teclado.nextInt();

        edad = 2026 - nacimiento;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }

        teclado.close();
    }
}
