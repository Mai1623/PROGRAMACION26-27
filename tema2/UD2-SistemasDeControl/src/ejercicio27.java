/*
Números primos: Determinar si un número introducido por el usuario es primo. (Divisible sólo por sí mismo y la unidad)
 */

/**
 *
 * @author Clase
 */

// Importamos Scanner para poder leer datos del teclado.
import java.util.Scanner;

// Creamos la clase principal del programa.
public class ejercicio27{

    // Método principal donde comienza la ejecución.
    public static void main(String[] args) {

        // Creamos el objeto para leer los datos introducidos.
        Scanner teclado = new Scanner(System.in);

        // Declaramos la variable donde guardaremos el número.
        int numero;

        // Declaramos una variable para indicar si es primo.
        boolean primo = true;

        // Pedimos al usuario que introduzca un número.
        System.out.print("Introduzca un numero: ");

        // Leemos el número introducido por el usuario.
        numero = teclado.nextInt();

        // Los números menores que 2 no son primos.
        if (numero < 2) {

            // Indicamos que el número no es primo.
            primo = false;

        // Si el número es mayor o igual que 2, buscamos divisores.
        } else {

            // Probamos los posibles divisores desde 2 hasta numero - 1.
            for (int i = 2; i < numero; i++) {

                // Comprobamos si la división tiene resto cero.
                if (numero % i == 0) {

                    // Si tiene un divisor, el número no es primo.
                    primo = false;

                    // Terminamos el bucle porque ya encontramos un divisor.
                    break;
                }
            }
        }

        // Comprobamos si el número es primo.
        if (primo) {

            // Mostramos el mensaje si es primo.
            System.out.println("El numero es primo.");

        // Si no es primo, ejecutamos esta alternativa.
        } else {

            // Mostramos el mensaje si no es primo.
            System.out.println("El numero no es primo.");
        }

        // Cerramos el Scanner.
        teclado.close();
    }
}

