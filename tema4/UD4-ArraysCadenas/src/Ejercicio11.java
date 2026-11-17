/*

Ampliación
Dado un array de números enteros, muestra únicamente los valores que aparecen una sola vez.
Ejemplo:
    Original: [2, 5, 3, 2, 8, 5, 9]
    Resultado: [3, 8, 9]
Puedes utilizar bucles anidados.

*/

/**
 * @author Maitane Navarro
 */


import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Creamos el array
        int[] numeros = new int[7];

        // Pedimos los números al usuario
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduce el número " + (i + 1) + ":");
            numeros[i] = teclado.nextInt();
        }

        // Mostramos los números que aparecen una sola vez
        System.out.print("Resultado: ");

        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;

            // Comprobamos cuántas veces aparece cada número
            for (int a = 0; a < numeros.length; a++) {
                if (numeros[i] == numeros[a]) {
                    contador++;
                }
            }

            // Si aparece una sola vez, lo mostramos
            if (contador == 1) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
