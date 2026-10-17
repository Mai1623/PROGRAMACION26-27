

/**
 *
 * @author Maitane Navarro
 */
/*1. Hola usuario: Escribe un programa que muestre por pantalla “Hola “ y el nombre
introducido por teclado. Ejemplo: si introducimos “Pepito” mostraría “Hola Pepito”.
¿Cómo harías para mostrar una admiración al final? Ej: “Hola Pepito!”
import java.util.Scanner; // Importamos Scanner para leer datos por teclado.
*/ 

import java.util.Scanner;
public class ejercicio1 { // Declaramos la clase principal del programa.

    public static void main(String[] args) { // Método principal: aquí empieza la ejecución.

        Scanner teclado = new Scanner(System.in); // Creamos un Scanner para leer lo que escriba el usuario.

        System.out.println("Introduce tu nombre:"); // Mostramos un mensaje pidiendo el nombre.

        String nombre = teclado.nextLine(); // Leemos el nombre y lo guardamos en la variable nombre.

        System.out.println("Hola " + nombre + "!"); // Mostramos el saludo, el nombre y la admiración.

        teclado.close(); // Cerramos el Scanner porque ya no lo necesitamos.
    } // Cerramos el método main.
} // Cerramos la clase HolaUsuario.