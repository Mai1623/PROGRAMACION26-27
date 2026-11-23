/*
Información de una palabra
Solicita al usuario una palabra y muestra:
    La palabra introducida.
    Su longitud.
    Su primer carácter.
    Su último carácter.
Ejemplo:
Introduce una palabra: Programacion

Longitud: 12
Primer carácter: P
Último carácter: n
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Introducir palabra
        System.out.println("Introduce una palabra: ");
        String palabra = teclado.nextLine();
        
        // Saber longitud palabra
        int longitud = palabra.length();
        System.out.println("La longitud es: " + longitud);
        
        // Primer caracter
        char primer = palabra.charAt(0);
        System.out.println("Primer caracter: " + primer);        
        
        // Ultimo caracter
        char ultimo = palabra.charAt(palabra.length() - 1);
        System.out.println("Ultimo caracter: " + ultimo); 
    }
}
