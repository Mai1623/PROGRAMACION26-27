/*
Suma hasta pulsar tecla cero:
Suma de números hasta que el usuario ingrese 0. 
Cada vez que el usuario introduzca un número lo sumo a lo que ya tenía y le pregunto otra vez.
Este tipo de algoritmos se llaman acumuladores
 */

/**
 *
 * Maitane
 */


import java.util.Scanner; 

public class ejercicio20 { 
    public static void main(String[] args) { 

        Scanner teclado = new Scanner(System.in); 
        // Inicio en 1 porque el 0 es para parar
        int numero = 1; 
        // Iniciamos en 0 la suma 
        int suma = 0; 

        // Repetir hasta que introduzca el 0 para parar el bucle 
        //mientras que numero sea distinto a cero
        while (numero != 0) { 
            //Introducir y leer el numero de usuario
            System.out.println("Introduce un número (0 para terminar):"); 
            numero = teclado.nextInt(); 
            // Sumar el número al acumulador
            suma = suma + numero; 
           // Mostramos la suma acumulada en cada paso
            System.out.println("La suma actual es: " + suma); 
        }
        // Mostramos el resultado final
        System.out.println("La suma total es: " + suma); 

        teclado.close(); // Cerramos el Scanner
    } 
} 
