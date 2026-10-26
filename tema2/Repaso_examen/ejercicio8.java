/*
Sumar del 1 hasta el número introducido
Pide un número entero y suma todos los números desde 1 hasta ese número.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        // Pedir el número al usuario
        System.out.print("Introduce un número entero: ");
        int num = teclado.nextInt();
        
        int suma = 0;
        for (int i = 1; i <= num; i++){
            suma = suma + i;
        }
        System.out.println("La suma es: " + suma);    
    }
}

