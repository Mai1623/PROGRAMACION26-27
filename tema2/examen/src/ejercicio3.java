/*
Parte A: Programación (3 puntos)
Diseña un programa en Java que simule el proceso de recarga de batería de un robot explorador.
    El robot empieza con una batería inicial del 10%.
    En cada ciclo (bucle), el robot realiza una carga interactiva donde se le pregunta al usuario cuántos puntos de energía desea inyectar (un entero entre 1 y 30).
    Si el usuario introduce un valor fuera de rango (menor que 1 o mayor que 30), el sistema debe mostrar "Entrada inválida" y pedir el valor de nuevo sin sumar nada a la batería.
    La recarga finaliza cuando la batería alcanza o supera el 100%.
    Al finalizar el bucle, debe mostrar el número total de ciclos de recarga que han sido necesarios.

*/

/**
 *
 * @author Maitane Navarro
 */

package examen;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer los datos del teclado.
        Scanner teclado = new Scanner(System.in);

        // Inicializamos la batería del robot al 10%.
        int bateria = 10;

        // Inicializamos el contador de ciclos de recarga a cero.
        int ciclos = 0;
    }
}
