/*
Contar hasta un numero usando "repetir hasta"
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner; 

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Pedir el número al usuario
        System.out.print("Introduce un número entero: ");
        int limite = teclado.nextInt();
        
        //Empezamos el número en 20
        int numero = 10; 
        do {
            // Mostrar numero desde elnumero que teniamos hasta el numero que 
            // ha puesto el usuario
            System.out.println("Numero: " + numero);
        numero--;
        
        // Siempre y cuando el numero sea mayor que el número introducido 
        // por el usuario
        } while (numero >= limite );
        System.out.println("Fin del programa");
    }
}