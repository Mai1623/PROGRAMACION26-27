/*
Suma de números: Calcular la suma de los números del 1 al 100.
*/

/**
 *
 * @author Maitane Navarro
 */


public class ejercicio22 {
    public static void main(String[] args) {
        // Creamos una variable para guardar la suma
        int suma = 0;
        // Recorremos los números desde el 1 hasta el 100
        for (int i = 1; i <= 100; i++) {
            // Sumamos el número actual al acumulador
            suma = suma + i;
        }
        // Mostramos el resultado final
        System.out.println("La suma del 1 al 100 es: " + suma);
    }
}

