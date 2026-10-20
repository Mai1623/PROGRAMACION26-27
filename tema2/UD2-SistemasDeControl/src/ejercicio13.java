/*
ejercicio13 contar hasta un numero usando "hacer mientras"
*/

/**
 *
 * @author Maitane
 */

import java.util.Scanner; 

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Pedir el número al usuario
        System.out.print("Introduce un número entero: ");
        int limite = teclado.nextInt();
        
        //Empezamos el número en 1
        int numero = 1; 
        do {
            // Mostrar numero hasta el limite 
            System.out.println("Numero: " + numero);
        numero++;
                // Siempre y cuando el numero sea menor que el número introducido 
        // por el usuario
        } while (numero <= limite);
        System.out.println("Fin del programa");
    }
}

