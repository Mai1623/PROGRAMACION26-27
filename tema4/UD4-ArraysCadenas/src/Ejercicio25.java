/*
Analizador de usuario
Solicita un nombre de usuario y comprueba:
    Que no esté vacío.
    Que tenga al menos 5 caracteres.
    Que no supere los 15 caracteres.
Muestra los resultados de las comprobaciones.
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Introducir un nombre
        System.out.println("Introduce un nombre: ");
        String nombre = teclado.nextLine();
        
        // Comprobar que no este vacío
        System.out.println("¿Esta vacio? " + (nombre.length() < 0));

        // Comprobar que tenga al menos 5 letras
        System.out.println("¿Tiene al menos 5 letras? " + (nombre.length() >= 5));

        // Comprobar que no supere los 15 caracteres
        System.out.println("¿No supera las 15 letra? " + (nombre.length() <= 15));
    }
}
