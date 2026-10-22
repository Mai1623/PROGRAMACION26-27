/*
Suma hasta pulsar tecla cero:
Suma de números hasta que el usuario ingrese 0. 
Cada vez que el usuario introduzca un número lo sumo a lo que ya tenía y le pregunto otra vez.
Este tipo de algoritmos se llaman acumuladores
        con el do-while
 */

/**
 *
 * @author Maitane
 */

import java.util.Scanner; 

public class ejercicio20DoWhile { 
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        // Variable que guardará el número introducido
        int numero; 
        // Iniciamos la suma en 0
        int suma = 0; 

        do {
            // Pedimos un número
            System.out.println("Introduce un número (0 para terminar):"); 
            // Leemos el número introducido
            numero = teclado.nextInt(); 
            // Sumamos el número al acumulador
            suma = suma + numero; 
            // Mostramos la suma acumulada
            System.out.println("La suma actual es: " + suma); 
         
            // Repetimos mientras el número sea distinto de cero
        } while (numero != 0); 
        // Mostramos la suma final
        System.out.println("La suma total es: " + suma); 

        teclado.close(); 
    } 
}
