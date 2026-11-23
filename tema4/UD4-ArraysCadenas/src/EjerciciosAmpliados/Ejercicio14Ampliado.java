package EjerciciosAmpliados;

/*
Disponemos del siguiente array:
int[] numeros = {2, 5, 2, 8, 2, 9, 5, 2};
Desarrolla un programa que:
    Busque cuántas veces aparece el número 2.
    Muestre el resultado.
    Permita cambiar el número buscado.
Ampliación: mostrar cuántas veces aparece cada uno de los números 2, 5, 8 y 9.
*/

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;

public class Ejercicio14Ampliado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crear un array de enteros.
        int[] numeros = {2, 5, 2, 8, 2, 9, 5, 2};

        // Solicitar el número que queremos buscar
        System.out.println("Introduce el número que quieras buscar:");
        int buscar = teclado.nextInt();

        // Contador para contar cuántas veces aparece el número
        int contador = 0;

        // Recorrer el array
        for (int i = 0; i < numeros.length; i++) {

            // Comprobar si el número coincide con el buscado
            if (numeros[i] == buscar) {

                // Aumentar el contador
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("El número " + buscar + " aparece " + contador + " veces.");

        // AMPLIACIÓN: contar cuántas veces aparece cada número

        // Crear un array con los números que queremos buscar
        int[] buscarNumeros = {2, 5, 8, 9};

        // Recorrer los números que queremos buscar
        for (int i = 0; i < buscarNumeros.length; i++) {

            // Inicializar el contador a cero
            int contadorAmpliacion = 0;

            // Recorrer el array original
            for (int j = 0; j < numeros.length; j++) {

                // Comprobar si los números coinciden
                if (numeros[j] == buscarNumeros[i]) {

                    // Aumentar el contador
                    contadorAmpliacion++;
                }
            }

            // Mostrar cuántas veces aparece cada número
            System.out.println("El número " + buscarNumeros[i] +
                    " aparece " + contadorAmpliacion + " veces.");
        }
    }
}
