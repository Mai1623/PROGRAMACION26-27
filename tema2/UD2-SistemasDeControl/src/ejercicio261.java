/*
a Escribe el código para este diagrama. 
    ¿Qué hace el programa?

b Escribe un flujograma para este pseudocódigo. ¿Qué hace el programa?
*/

/**
 *
 * @author Maitane
 */


 // Importamos Scanner para poder leer datos por teclado.
import java.util.Scanner;

// Creamos la clase principal.
public class ejercicio261 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario que introduzca un número y lo guardamos.
        System.out.print("Ingrese el numero: ");
        int a = teclado.nextInt();

        // Pedimos al usuario que introduzca el divisor y lo guardamos.
        System.out.print("Ingrese el divisor: ");
        int b = teclado.nextInt();

        // Comprobamos si el divisor es cero.
        if (b == 0) {
            // Mostramos un mensaje si el divisor es cero.
            System.out.println("El divisor no puede ser cero.");
        // Comprobamos si la división es exacta.
        } else if (a % b == 0) {
            // Mostramos que el divisor es exacto.
            System.out.println(b + " es divisor exacto de " + a + ".");
        // Si no se cumple ninguna condición anterior, la división no es exacta.
        } else {
            // Mostramos el resto de la división.
            System.out.println("El resto de dividir " + a + " por " + b
                    + " es: " + (a % b));
        }
    }
}
