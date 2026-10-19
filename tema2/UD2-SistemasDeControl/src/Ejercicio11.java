/*
Ejercicio 11: Muestra 100 lineas con el texto "Hola mundo!" y enumeralas
1. Hola mundo!
2. Hola mundo!
...
100. Hola mundo!
*/
/**
 *
 * @author Maitane 
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int contador = 1;
        int limite = 100;

        // Se repite mientras contador sea menor o igual a 100
        while (contador <= limite) {
            // Imprimimos el numero hasta el final mas el mensaje
            System.out.println(contador +"." + " Hola Mundo!"); 
            // Incrementa el contador para evitar un bucle infinito
            contador++;
        }
    }
}
