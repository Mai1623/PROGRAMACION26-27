/*
Tabla de multiplicar: Imprimir la tabla de multiplicar de un número.
*/

/**
 *
 * @author 06_1DAW
 */

import java.util.Scanner; 
public class ejercicio21 { 

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int numero; // Declaramos la variable que guardará el número
       
        System.out.println("Introduce un número:"); // Pedimos un número al usuario
        numero = teclado.nextInt(); // Leemos el número introducido

        for (int i = 1; i <= 10; i++) { // Repetimos desde 1 hasta 10
            
            // Mostramos cada multiplicación
            System.out.println(numero + " x " + i + " = " + (numero * i)); 
        } 
        teclado.close(); // Cerramos el Scanner
    }
} 
