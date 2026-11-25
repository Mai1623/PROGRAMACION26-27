/* 
 Limpiador de datos
Solicita al usuario un nombre completo que puede contener espacios innecesarios
y combinaciones de mayúsculas y minúsculas.
El programa debe:
    Eliminar los espacios iniciales y finales.
    Mostrar el texto en mayúsculas.
    Mostrar el texto en minúsculas.
    Sustituir los espacios por guiones.
Ejemplo:
Entrada: "   Ana García López   "

Resultado:
ANA GARCÍA LÓPEZ
ana garcía lópez
Ana-García-López
 
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //solicita al usuario un nombre completo
        System.out.println("Escribe tu nombre completo: ");
        String nombre = teclado.nextLine();

        //Mostrar el texto en mayúsculas.
        nombre = nombre.toUpperCase();
        System.out.println("El nombre en mayusculas: " + nombre);
        
        //Mostrar el texto en minúsculas.
        nombre = nombre.toLowerCase();
        System.out.println("El nombre en minusculas: " + nombre);
        
        //Eliminar los espacios iniciales y finales.
        String espacios = nombre;
        System.out.println("Espacios eliminados: " + espacios.trim());
        
        //Sustituir los espacios por guiones.
        String guiones = nombre;
        String resultado = guiones.replace (' ', '-');
        System.out.println(resultado);
    }

    
}
