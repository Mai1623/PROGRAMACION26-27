/*
Pedir números hasta introducir un cero

El programa pide números continuamente. Cuando el usuario introduce un 0, termina y muestra la suma de los números anteriores, sin incluir el cero.
*/

package Pruebas_examen;

import java.util.Scanner;

/**
 *
 * @author Maitane Navarro
 */
public class ejercicio13 {

    // Método principal donde comienza la ejecución del programa.
    public static void main(String[] args) {
        int factorial = 1; // El factorial es la multiplicación de los números
        
        int numIntroducido;
        
        // Pedir el dato al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el número para calcular el factorial:");
        
        numIntroducido = entrada.nextInt();
        
        
        // Cálculo
        
        for(int i=numIntroducido; i>1; i--) {
            
            factorial *= i;
            
        }
        
        System.out.println("El factorial de " + numIntroducido + " es " + factorial);
}
}
