
/*
Mostrar usando un for y el continue solo los numeros pares desde el 1 al 10.
*/

/**
 *
    Maitane
 */

public class ejercicio17SinContinue {
    // Método principal donde empieza el programa
    public static void main(String[] args) {
        // Recorremos los números desde el 1 hasta el 10, aumentando de 1 en 1
        for (int num = 1; num <= 10; num++) {
            // Comprobamos si el número es par
            if (num % 2 == 0) {
                // Mostramos el número si es par
                System.out.println(num);
            }
        }
    }
}
