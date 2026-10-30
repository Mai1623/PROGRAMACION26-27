/*

Objetivo: practicar Scanner, if, else if, else y while.
Enunciado
Crea un programa en Java que pida al usuario una nota del 0 al 10 y muestre el resultado según estas condiciones:
Si la nota es menor que 0 o mayor que 10, mostrar "Nota no válida".
Si la nota es menor que 5, mostrar "Suspenso".
Si la nota está entre 5 y 6, mostrar "Aprobado".
Si la nota está entre 7 y 8, mostrar "Notable".
Si la nota es 9 o 10, mostrar "Sobresaliente".
Al final, pregunta si quiere introducir otra nota. Si responde que sí, el programa debe repetir el proceso.

*/
package Pruebas_examen;

/**
 *
 * @author 06_1DAW
 */
import java.util.Scanner;

public class ejercicioNuevo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respuesta = "si";

        while (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Introduce una nota: ");
            double nota = teclado.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota no válida");
            } else if (nota < 5) {
                System.out.println("Suspenso");
            } else if (nota <= 5) {
                System.out.println("Aprobado");
            } else if (nota <= 8) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }

            System.out.print("¿Quieres introducir otra nota? (si/no): ");
            respuesta = teclado.next();
        }
    }
}