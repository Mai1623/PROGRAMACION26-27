/*
Crear un menú interactivo
Crea un programa que muestre el siguiente menú:
    1. Saludar.
    2. Mostrar los números del 1 al 10.
    3. Calcular el cuadrado de un número.
    4. Salir.
El usuario debe poder elegir una opción. Después de ejecutar la opción seleccionada, el menú volverá a aparecer hasta que elija salir.
Pista: utiliza do-while para repetir el menú y switch para ejecutar las opciones.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Saludar.");
            System.out.println("2. Mostrar los números del 1 al 10.");
            System.out.println("3. Calcular el cuadrado de un número.");
            System.out.println("4. Salir.");

            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("¡Hola! Bienvenido al programa.");
                    break;

                case 2:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                    }
                    break;

                case 3:
                    System.out.print("Introduce un número: ");
                    double numero = teclado.nextDouble();

                    double cuadrado = numero * numero;

                    System.out.println("El cuadrado es: " + cuadrado);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println(
                        "Opción no válida. Inténtalo de nuevo."
                    );
            }

        } while (opcion != 4);
    }
}
