/*
Analizar una serie de números

Pide al usuario 10 números enteros. Al terminar, muestra cuántos son positivos, cuántos negativos y cuántos son ceros.

Pista: utiliza un for y tres contadores independientes.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 1; i <=10; i++){
            System.out.print("Introduce un número: ");
            int numero = teclado.nextInt();
            if (numero > 0){
               positivos++;
           } else if(numero ==0){
               ceros++;
           } else {
               negativos++;
           }
           System.out.println("Numeros positivos: " + positivos);
           System.out.println("Numeros negativos: " + negativos);
           System.out.println("Numeros ceros: " + ceros);

       }
    }
}
