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
        System.out.println("1. Saludar");
        System.out.println("2. Mostrar los numeros del 1 al 10");
        System.out.println("3. Calcular el cuadrado de un numero");
        System.out.println("4. Salir");
        System.out.println("Elige una opcion: ");
        
            switch (opcion) {
            case 1:
                   System.out.prinln("Hola!")
                break;

            case 2:
                // Acción de la opción 2
                break;

            case 3:
                // Acción de la opción 3
                break;

            case 4:
                // Acción de la opción 4
                break;

            default:
                // Opción no válida
        }
            
        }
    }

}
