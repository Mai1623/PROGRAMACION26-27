 /*
Comparador de palabras
Solicita dos palabras y comprueba:
    Si son iguales.
    Si son iguales ignorando mayúsculas y minúsculas.
    Si tienen la misma longitud.
Ejemplo:
Primera palabra: Java
Segunda palabra: JAVA

¿Son iguales? false
¿Son iguales ignorando mayúsculas? true
¿Tienen la misma longitud? true
*/

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Introducir primera palabra
        System.out.println("Introduce una palabra: ");
        String pal1 = teclado.nextLine();

        // Introducir segunda palabra
        System.out.println("Introduce otra palabra: ");
        String pal2 = teclado.nextLine();

        // Comprobar si son iguales
        System.out.println("¿Son iguales? " + pal1.equals(pal2));

        // Comprobar si son iguales ignorando mayúsculas
        System.out.println("¿Son iguales ignorando mayúsculas? "
                + pal1.equalsIgnoreCase(pal2));

        // Comprobar si tienen la misma longitud
        System.out.println("¿Tienen la misma longitud? "
                + (pal1.length() == pal2.length()));
    }
}