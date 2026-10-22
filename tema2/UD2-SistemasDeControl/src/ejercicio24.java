/*
 Suma pares: realiza la suma sólo de los números pares del 1 al 100
*/

/**
 *
 * @author 06_1DAW
 */

public class ejercicio24 {
    public static void main(String[] args) {
        // Creamos una variable para guardar la suma
        int suma = 0;
        // Recorremos los números desde el 1 hasta el 100
        for (int i = 1; i <= 100; i++) {
            // Comprobamos si el número es impar
            if (i % 2 != 0) {
                // Saltamos los números impares y pasamos a la siguiente vuelta
                continue;
            }
            // Sumamos el número par al acumulador
            suma = suma + i;
        }
        // Mostramos el resultado final
        System.out.println("La suma del 1 al 100 es: " + suma);
    }
}

