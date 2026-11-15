/*

Bucle while con if-else para controlar la parada
Objetivo: Pedir números por consola de forma indefinida hasta que el usuario introduzca un número negativo.
Guía paso a paso:
    Inicializa un Scanner para la entrada de datos.
    Define una variable numero inicializada en 0 para permitir la primera entrada al bucle while (numero >= 0).
    Lee el dato introducido por el usuario y usa un if-else para comprobar si debe procesar el número o informar del cierre.


*/
package tema2;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        
        while (numero >= 0){
        System.out.println("Introduce un numero: ");
        numero = teclado.nextInt();
        
        if (numero >= 0){
            System.out.println("Numero introducido: " + numero);
       }else{
            System.out.println("Numero negativo");
        }
    }
    }
}
