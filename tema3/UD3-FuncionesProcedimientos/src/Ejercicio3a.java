/*
diseñar un metodo que calcule el importe de una compra aplicando un descuento

nivel               requisitos
iniciacion          recibir un precio y devolver el precio con un descuento fijo
 */

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class Ejercicio3a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pido precio de la compra
        System.out.print("Introduce el precio de la compra: ");

        // Guardo el precio
        double precio = teclado.nextDouble();

        // Llamamos al método para calcular el precio con descuento
        double importeFinal = calcularImporte(precio);

        // Mostramos el importe final por pantalla.
        System.out.println("Precio inicial: " + precio + " €");
        System.out.println("Importe final con descuento: " + importeFinal + " €");
    }

    // Recibe el precio y devuelve el importe con un descuento del 10 %.
    // Double porque pueden ser decimales.
    public static double calcularImporte(double precio) {
        return precio - (precio * 0.10);
    }
}
