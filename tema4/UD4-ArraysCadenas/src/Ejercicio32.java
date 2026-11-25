/*
Contador de vocales
Solicita una frase al usuario y cuenta cuántas vocales contiene.
Requisitos:
    Utilizar Scanner.
    Convertir la cadena a minúsculas.
    Recorrer la cadena con for.
    Acceder a los caracteres mediante charAt().
    Contar las vocales a, e, i, o, u.
Ejemplo:
    Introduce una frase: Estoy aprendiendo Java
    Número de vocales: 9
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        // Utilizar Scanner.
        Scanner teclado = new Scanner(System.in);
        
        //  Solicita una frase al usuario y cuenta cuántas vocales contiene.
        System.out.println("Escribe una frase: ");
        String frase = teclado.nextLine();
        
        //  Convertir la cadena a minúsculas.
        frase = frase.toLowerCase();
        System.out.println("El nombre en minusculas: " + frase);
        
        int contador=0;
        
        //  Recorrer la cadena con for y Acceder a los caracteres mediante charAt().
        for (int i = 0; i < frase.length(); i++){
            //coger caracter
            char letra = frase.charAt(i);
       
        //  Contar las vocales a, e, i, o, u.
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
        contador++;
            }
        }
        // Mostrar el resultado.
        System.out.println("Numero de vocales: " + contador);
    }
}

