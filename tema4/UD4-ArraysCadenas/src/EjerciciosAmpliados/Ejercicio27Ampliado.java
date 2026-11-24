package EjerciciosAmpliados;

/*
Buscador de palabras
Solicita una frase y una palabra.
El programa debe indicar:
    Si la frase contiene la palabra.
    En qué posición aparece por primera vez.
    Si la frase comienza por esa palabra.
    Si la frase termina por esa palabra.
Ejemplo:
Frase: Estoy aprendiendo Java
Palabra: Java

¿Contiene la palabra? true
Posición: 18
¿Comienza por ella? false
¿Termina por ella? true
Ampliación: permitir que la búsqueda no distinga entre mayúsculas y minúsculas.
*/

/**
 *
 * @author mai_n
 */

import java.util.Scanner;

public class Ejercicio27Ampliado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // meter frase y palabra
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();
        
        System.out.println("Introduce una palabra: ");
        String palabra = teclado.nextLine();
        
        // comprobar si tiene la palabra
        System.out.println("La frase tiene la palabra? " + frase.contains(palabra));
        
        // buscar la posicion de la primera aparicion
        System.out.println("Posicion: " + frase.indexOf(palabra));
        
        //comprobar si empieza por esa palabra
        System.out.println("¿Comienza por ella? " + frase.startsWith(palabra));
        
        // comprobar si termina por la palabra
        System.out.println("¿Termina por ella? " + frase.endsWith(palabra));
    }
}
