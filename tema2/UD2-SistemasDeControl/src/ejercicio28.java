/*
Promedio: Pedir al usuario que introduzca varios números hasta pulsar la tecla espacio. Después muestra el promedio de todos los números introducidos.
*/

/**
 *
 * @author 06_1DAW
 */

import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce números (0 para terminar):");
        numero = teclado.nextInt();

        while (numero != 0) {
            suma = suma + numero;
            contador++;

            numero = teclado.nextInt();
        }

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No has introducido números.");
        }
    }
}

