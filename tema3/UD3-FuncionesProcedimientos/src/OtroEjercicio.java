/*
Muestra los primeros 10 numeros primos

*/

/**
 *
 * @author Maitane Navarro
 */


public class OtroEjercicio {

    public static void main(String[] args) {

        // Llamamos al procedimiento
        mostrarPrimos();

    }

    // FUNCIÓN que comprueba si un número es primo
    public static boolean esPrimo(int num) {

        // Comprobamos si el número es menor que 2
        if (num < 2) {
            return false;
        }

        // Comprobamos si tiene algún divisor
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        // Si no tiene divisores, es primo
        return true;
    }

    // PROCEDIMIENTO que muestra los 10 primeros primos
    public static void mostrarPrimos() {

        int contador = 0;
        int numero = 2;

        // Repetimos hasta encontrar 10 números primos
        while (contador < 10) {

            // Comprobamos si el número es primo
            if (esPrimo(numero)) {

                System.out.println("Los números primos son: " + numero);

                contador++;
            }

            // Pasamos al siguiente número
            numero++;
        }
    }
}

