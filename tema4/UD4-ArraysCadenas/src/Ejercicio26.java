/*
 Generador de iniciales
Solicita el nombre y los dos apellidos de una persona y muestra sus iniciales.
    Ejemplo:
    Nombre: Ana
    Primer apellido: García
    Segundo apellido: López

    Iniciales: AGL
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Meter el nombre y dos apellidos
        System.out.println("Mete tu nombre");
        String nombre = teclado.nextLine();
        
        System.out.println("Mete un apellido");
        String ape1 = teclado.nextLine();
        
        System.out.println("Mete otro apellido");
        String ape2 = teclado.nextLine();
        
        // muestra las iniciales
        char primer = nombre.charAt(0);
        System.out.println("Primer caracter del nombre: " + primer);  

        char segun = ape1.charAt(0);
        System.out.println("Primer caracter del apellido1: " + segun);       

        char tercer = ape2.charAt(0);
        System.out.println("Primer caracter del apellido2: " + tercer);       
        
        // Muestra las 3 iniciales juntas
        System.out.println("Las iniciales son: " + primer + segun + tercer);
    }
}
