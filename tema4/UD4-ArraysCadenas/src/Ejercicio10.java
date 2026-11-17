/*

Ampliación
Dado un array de números enteros, crea otro array con los elementos en orden inverso.
Ejemplo:
Original:  [3, 8, 5, 2, 9]
Invertido: [9, 2, 5, 8, 3]
No basta con mostrar los elementos en orden inverso: debes construir un segundo array.


*/

/**
 *
 * @author Maitane Navarro
 */




import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Creamos los dos arrays
        int[] original = new int[5];
        int[] invertido = new int[5];

        // Pedimos los números al usuario
        for (int i = 0; i < original.length; i++) {

            System.out.println("Introduce el número " + (i + 1) + ":");
            original[i] = teclado.nextInt();

        }

        // Copiamos los números en orden inverso
        for (int i = 0; i < original.length; i++) {

            invertido[i] = original[original.length - 1 - i];

        }

        // Mostramos el array original
        System.out.print("Original: ");

        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        // Mostramos el array invertido
        System.out.println();
        System.out.print("Invertido: ");

        for (int i = 0; i < invertido.length; i++) {
            System.out.print(invertido[i] + " ");
        }

        teclado.close();
    }
}
