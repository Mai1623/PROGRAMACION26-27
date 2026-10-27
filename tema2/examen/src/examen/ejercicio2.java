/*
Para sintonizar una emisora de emergencia, el sistema debe probar una serie de 
frecuencias de radio numéricas desde la frecuencia 100 hasta la 150 (de 1 en 1).
Se pide: Escribe un programa utilizando un bucle que analice las frecuencias en 
dicho rango bajo las siguientes reglas de negocio:
    Las frecuencias divisibles entre 5 se consideran "Frecuencias saturadas" y 
    deben saltarse sin imprimirse (utiliza la sentencia adecuada para saltar a
    la siguiente iteración).
    
    Si la frecuencia es exactamente 137, se ha encontrado la "Frecuencia de Socorro".
    El programa debe mostrar por pantalla "¡Frecuencia de socorro 137 hallada!
    Deteniendo el escaneo." y interrumpir inmediatamente el bucle.
   
    Para todas las demás frecuencias válidas, se debe imprimir: "Sintonizando frecuencia: [número]".

*/

/**
 *
 * @author Maitane Navarro
 */

package examen;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        // bucle para analiizar frecuencias de 100 a 150 de 1 en 1
        for (int i = 100; i <= 150; i++){
            // Comprobamos si la frecuencia es divisible entre 5
            if (i % 5 == 0) {
                /* No muestra frecuencias divisibles entre 5 
                105, 110, 115,120,125,130 */
                } else if (i == 137) { // Cuando llega a la frecuencia 137 porque ha llegado del 100 al 137 y se para
                // Mostramos el mensaje de socorro por pantalla porque ha llegado a 137
                System.out.println("¡Frecuencia de socorro 137 hallada! Deteniendo el escaneo.");
                // Detenemos inmediatamente el bucle porque ha llegado a la 137
                break;
            } else {
                // Mostramos la frecuencia válida por pantalla
                System.out.println("Sintonizando frecuencia: " + i);
            }
        }
    }
}