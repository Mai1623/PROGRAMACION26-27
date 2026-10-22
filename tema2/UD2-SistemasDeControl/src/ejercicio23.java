/*
Suma inversa: realiza la suma desde el 100 al 1
*/

/**
 *
 * @author Maitane Navarro
 */

public class ejercicio23 {
    public static void main(String[] args) {
        // Creamos una variable para guardar la suma
        int suma = 0;
        // Recorremos los números desde el 100 hasta el 0
        // disminuyendo el contador y siendo i mayor o igual a 0
        for (int i = 100; i >= 0; i--) {
            // Sumamos el número actual al acumulador
            suma = suma + i;
        }
        // Mostramos el resultado final
        System.out.println("La suma del 1 al 100 es: " + suma);
    }
}

