/*

Inicial
Crea un programa que almacene los siguientes números:
int[] numeros = {12, 5, 8, 20, 3, 15};
El programa debe:
    Mostrar todos los números utilizando un for.
    Mostrar todos los números utilizando un for-each.
    Mostrar únicamente los números mayores que 10.

*/

/**
 *
 * @author Maitane Navarro
 */

public class Ejercicio6 {

    public static void main(String[] args) {

        int[] numeros = {12, 5, 8, 20, 3, 15};

        // Mostrar con for
        System.out.println("Numeros con for:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Mostrar con for-each
        System.out.println("Numeros con for-each:");

        for (int n : numeros) {
            System.out.println(n);
        }

        // Mostrar números mayores que 10
        System.out.println("Numeros mayores que 10:");

        for (int n : numeros) {
            if (n > 10) {
                System.out.println(n);
            }
        }
    }
}
