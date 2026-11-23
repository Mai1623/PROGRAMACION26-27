package EjerciciosAmpliados;

/*
Utilizando el mismo array de la actividad anterior, modifica el programa para
que muestre la posición en la que se encuentra el número buscado.

Si no existe, debe mostrar un mensaje indicándolo.
Ejemplo:
Número buscado: 21
El número se encuentra en la posición 3.
Ampliación: mostrar todas las posiciones en las que aparece el número, no
solamente la primera.
*/


/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;

public class Ejercicio13Ampliado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crear un array de enteros.
        int[] numeros = {12, 9, 5, 8, 21, 8, 16, 8};

        // Solicitar al usuario el número que quiere buscar
        System.out.println("Introduce el número que quieres buscar:");

        // Guardar el número introducido por teclado
        int buscar = teclado.nextInt();

        // Variable para comprobar si hemos encontrado el número
        boolean encontrado = false;

        // Recorrer el array para buscar el número
        for (int i = 0; i < numeros.length; i++) {

            // Comprobar si el número actual coincide con el buscado
            if (numeros[i] == buscar) {

                // Mostrar la posición donde hemos encontrado el número
                System.out.println("El número se encuentra en la posición " + i);

                // Indicamos que hemos encontrado el número
                encontrado = true;
            }
        }

        // Comprobar si el número no existe en el array
        if (!encontrado) {
            System.out.println("El número " + buscar + " no se encuentra en el array.");
        }

        teclado.close();
    }
}
