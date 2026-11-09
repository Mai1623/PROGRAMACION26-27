/*
Ejercicio 2. Mostrar un saludo
Crea un programa que pida el nombre del usuario y muestre un saludo utilizando un procedimiento.

Requisitos:
    Crear un método llamado saludar().
    Recibirá un nombre de tipo String.
    Mostrará un mensaje de bienvenida.
    No devolverá ningún resultado.

*/
package EjerciciosRepasoIA;

/**
 *
 * @author Maitane Navarro
 */


import java.util.Scanner;

public class Ejercicio2 {

    // Creamos el Scanner para leer datos por teclado
    static Scanner teclado = new Scanner(System.in);

    // Metodo para saludar al usuario
    public static void saludar(String nombre) {

        // Mostramos un mensaje de bienvenida
        System.out.println("Bienvenido " + nombre);
    }

    // Metodo principal del programa
    public static void main(String[] args) {

        // Pedimos el nombre al usuario
        System.out.println("Introduce tu nombre:");

        // Guardamos el nombre introducido
        String nombre = teclado.nextLine();

        // Llamamos al metodo saludar
        saludar(nombre);

        // Cerramos el Scanner
        teclado.close();
    }
}

