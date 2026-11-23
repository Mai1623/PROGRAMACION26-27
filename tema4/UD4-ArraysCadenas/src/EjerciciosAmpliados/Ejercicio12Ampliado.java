package EjerciciosAmpliados;

/*
Crea un programa que almacene los siguientes números:
    int[] numeros = {12, 5, 8, 21, 4, 16, 9};
El programa debe buscar un número determinado y mostrar si está presente o no.
Requisitos:
    Crear un array de enteros.
    Definir una variable con el número que queremos buscar.
    Recorrer el array.
    Mostrar un mensaje indicando si se ha encontrado.
Ampliación: solicitar el número por teclado utilizando Scanner.
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Ejercicio12Ampliado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crear un array de enteros.
        int[] numeros = {12, 5, 8, 21, 4, 16, 9};
    
        // Ampliacion: Solicitar al usuario el número que quiere buscar
        System.out.println("Introduce el número que quieres buscar:");

        // Guardar el número introducido por teclado en una variable
        int buscar = teclado.nextInt();
        
        // Crear otra variable para ver si esta encontrado
        boolean encontrado = false;
        
        // Recorrer el array para buscar el número
        for (int i = 0; i < numeros.length; i++) {

            // Comprobar si el número de la posición actual es el que buscamos
            if (numeros[i] == buscar) {
                // Si coincide, cambiamos la variable a true
                encontrado = true;
                // Salimos del bucle porque ya hemos encontrado el número
                break;
            }
        }
        // Mostrar un mensaje indicando si se ha encontrado.
        if (encontrado = true){
            System.out.println("El numero ha sido encontrado");
        } else {
            System.out.println("El numero no ha sido encontrado");
        }
    }
}