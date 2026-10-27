/*
Números primos: Determinar si un número introducido por el usuario es primo. (Divisible sólo por sí mismo y la unidad)
*/

/**
 *
 * @author 06_1DAW
 */


import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        boolean primo = true;

        if (numero < 2) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }

        sc.close();
    }
}
