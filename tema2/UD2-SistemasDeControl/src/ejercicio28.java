/*
Promedio: Pedir al usuario que introduzca varios números hasta pulsar la tecla espacio. Después muestra el promedio de todos los números introducidos.
*/

/**
 *
 * @author Clase
 */

// Importamos Scanner para leer los datos introducidos por el usuario.
import java.util.Scanner;

// Creamos la clase principal del programa.
public class ejercicio28{

    // Método principal donde comienza la ejecución del programa.
    public static void main(String[] args) {

        // Creamos el Scanner para leer lo que escribe el usuario.
        Scanner teclado = new Scanner(System.in);

        // Declaramos una variable para acumular la suma de los números.
        double suma = 0;

        // Declaramos una variable para contar cuántos números se introducen.
        int contador = 0;

        // Creamos una variable para guardar cada dato introducido.
        String entrada;

        // Pedimos al usuario que introduzca números y explique cómo terminar.
        System.out.println("Introduzca numeros, uno por linea.");

        // Indicamos que una línea vacía sirve para finalizar.
        System.out.println("Pulse Enter sin escribir nada para terminar.");

        // Repetimos la lectura mientras el usuario no introduzca una línea vacía.
        while (true) {

            // Leemos una línea completa del teclado.
            entrada = teclado.nextLine();

            // Si la línea está vacía, salimos del bucle.
            if (entrada.trim().isEmpty()) {

                // Terminamos el bucle.
                break;
            }

            // Convertimos el texto introducido en un número decimal.
            double numero = Double.parseDouble(entrada);

            // Sumamos el número introducido al total acumulado.
            suma = suma + numero;

            // Aumentamos el contador de números introducidos.
            contador++;
        }

        // Comprobamos que se haya introducido al menos un número.
        if (contador > 0) {

            // Calculamos el promedio dividiendo la suma entre la cantidad.
            double promedio = suma / contador;

            // Mostramos el promedio calculado.
            System.out.println("El promedio es: " + promedio);

        // Si no se introdujo ningún número, no podemos calcular el promedio.
        } else {

            // Informamos al usuario de que no introdujo ningún número.
            System.out.println("No se introdujeron numeros.");
        }

        // Cerramos el Scanner.
        teclado.close();
    }
}
