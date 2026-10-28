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

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();

        // Creamos una variable que indica que el número es primo.
        boolean primo = true;
        // Comprobamos si el número es menor que 2.
        if (numero < 2) {
            // Si es menor que 2, no es primo.
            primo = false;
        // Si el número es 2 o mayor, comprobamos si tiene divisores.
        } else {
            // Recorremos los números desde el 2 hasta uno menos que el número.
            for (int i = 2; i < numero; i++) {
                // Comprobamos si la división entre el número e i es exacta.
                if (numero % i == 0) {
                    // Si el resto es 0, el número no es primo.
                    primo = false;
                    // Terminamos el bucle porque ya hemos encontrado un divisor.
                    break;
                }
            }
        }
        // Comprobamos si la variable primo sigue siendo verdadera.
        if (primo) {

            // Mostramos un mensaje indicando que el número es primo.
            System.out.println("El número es primo");

        // Si la variable primo es falsa, el número no es primo.
        } else {

            // Mostramos un mensaje indicando que el número no es primo.
            System.out.println("El número no es primo");
        }
    }
}

