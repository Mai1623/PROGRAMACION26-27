package EjerciciosAmpliados;

/*
Construir un nombre completo
Solicita al usuario:
    Nombre.
    Primer apellido.
    Segundo apellido.
Construye y muestra el nombre completo.
Después, muestra el número total de caracteres.
Ampliación: muestra el nombre completo en mayúsculas y minúsculas, sin modificar la cadena original.
*/

/**
 *
 * @author mai_n
 */

import java.util.Scanner;

public class Ejercicio23Ampliado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Introducir nombre
        System.out.println("Introduce un nombre: ");
        String nombre = teclado.nextLine();

        // Introducir primer apellido
        System.out.println("Introduce un apellido: ");
        String ape1 = teclado.nextLine();

        // Introducir segundo apellido
        System.out.println("Introduce otro apellido: ");
        String ape2 = teclado.nextLine();

        // Construir nombre completo
        String nombreCompleto = nombre + " " + ape1 + " " + ape2;

        System.out.println("Nombre completo: " + nombreCompleto);

        // Calcular total de caracteres
        int total = nombreCompleto.length();

        System.out.println("Total de caracteres: " + total);

        // Mostrar en mayúsculas
        System.out.println("Mayusculas: " + nombreCompleto.toUpperCase());

        // Mostrar en minúsculas
        System.out.println("Minusculas: " + nombreCompleto.toLowerCase());

    }
}

