/*

Bucle for con if para filtrar números pares
Objetivo: Recorrer una secuencia de números del 1 al 10 e imprimir únicamente aquellos que sean pares.
Guía paso a paso:
    Crea un bucle for que comience con i = 1 y se repita mientras i <= 10.
    Dentro del bucle, evalúa si i es par mediante la condición if (i % 2 == 0).
    Imprime únicamente el valor si la condición del if se cumple.


*/

package tema2;

/**
 *
 * @author Maitane Navarro
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++){
            if (i % 2 == 0){
                System.out.println("Los numeros pares son: " + i);
            }
        }
    }
}
