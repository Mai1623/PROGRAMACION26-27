/*
Crea un programa en Java que encuentre y muestre por pantalla los 10 primeros números primos
*/

/**
 *
 * @author Maitane Navarro
 */


public class ejercicio29 {
    public static void main(String[] args) {
        // Contamos los números primos encontrados
        int contador = 0;
        // Recorremos los números desde el 2 hasta encontrar 10 primos
        for (int numero = 2; contador < 10; numero++) {
            // Suponemos que el número es primo
            boolean primo = true;
            // Comprobamos si tiene algún divisor
            for (int i = 2; i < numero; i++) {
                // Si el resto es cero, no es primo
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
            // Si el número es primo, lo mostramos
            if (primo) {
                System.out.println("Numero primo: " + numero);

                // Aumentamos el contador de primos
                contador++;
            }
        }
    }
}
