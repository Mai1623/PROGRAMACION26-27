/*
Utilizando el mismo array de la actividad anterior, modifica el programa para
que muestre la posición en la que se encuentra el número buscado.

Si no existe, debe mostrar un mensaje indicándolo.
Ejemplo:
Número buscado: 21
El número se encuentra en la posición 3.
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        // Crear un array de enteros.
        int[] numeros = {12, 5, 8, 21, 4, 16, 9};
    
        // Ampliacion: Solicitar al usuario el número que quiere buscar
        System.out.println("Introduce el número que quieres buscar:");

        // Guardar el número introducido por teclado en una variable
        int buscar = teclado.nextInt();
        
        // Crear una variable para guardar la posición del número
        // Inicializamos a -1 porque esa posición no existe en el array 
        int posicion = -1;
        
        // Recorrer el array para buscar el número
        for (int i = 0; i < numeros.length; i++) {

            // Comprobar si el número actual coincide con el buscado
            if (numeros[i] == buscar) {
                // Guardar la posición donde hemos encontrado el número
                posicion = i;
                // Salir del bucle porque ya hemos encontrado el número
                break;
            }
        }
        // Mostrar la posición si se ha encontrado el número
        if (posicion != -1) {
            System.out.println("El número se encuentra en la posición " + posicion);
        } else {
            // Si la posición sigue siendo -1, el número no existe
            System.out.println("El número " + buscar + " no se encuentra en el array.");
        }
    }
}
