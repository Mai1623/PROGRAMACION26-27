/*

Intermedio
Una tienda necesita actualizar los precios de sus productos.
double[] precios = {10.0, 15.5, 20.0, 8.5, 12.0};
El programa debe:
    Mostrar los precios originales.
    Incrementar todos los precios un 5 %.
    Mostrar los precios actualizados.
    Calcular el precio medio.
    Contar cuántos productos cuestan más de 15 euros.

*/

/**
 *
 * @author Maitane Navarro
 */



public class Ejercicio8 {

    public static void main(String[] args) {

        // Creamos el array con los precios
        double[] precios = {10.0, 15.5, 20.0, 8.5, 12.0};

        double suma = 0;
        int contador = 0;

        // Mostrar los precios originales
        System.out.println("PRECIOS ORIGINALES");

        for (double p : precios) {
            System.out.println(p + " euros");
        }

        // Aumentar todos los precios un 5%
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * 1.05;
        }

        // Mostrar los precios actualizados
        System.out.println("PRECIOS ACTUALIZADOS");

        for (double p : precios) {
            System.out.println(p + " euros");

            // Sumar los precios
            suma = suma + p;

            // Contar los productos que cuestan más de 15 euros
            if (p > 15) {
                contador++;
            }
        }

        // Calcular el precio medio
        System.out.println("Precio medio: " + (suma / precios.length));

        // Mostrar cuántos productos cuestan más de 15 euros
        System.out.println("Productos de más de 15 euros: " + contador);

    }
}
