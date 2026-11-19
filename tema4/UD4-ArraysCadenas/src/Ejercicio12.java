/*
Crea un programa que almacene los siguientes números:
    int[] numeros = {12, 5, 8, 21, 4, 16, 9};
El programa debe buscar un número determinado y mostrar si está presente o no.
Requisitos:
    Crear un array de enteros.
    Definir una variable con el número que queremos buscar.
    Recorrer el array.
    Mostrar un mensaje indicando si se ha encontrado.
*/

/**
 *
 * @author Maitane Navarro
 */


public class Ejercicio12 {
    public static void main(String[] args) {
        

        // Crear un array de enteros.
        int[] numeros = {12, 5, 8, 21, 4, 16, 9};
    
        // Definir una variable con el número que queremos buscar.
        int buscar = 4;
        
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
