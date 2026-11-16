/*
Gestión de precios
Nivel intermedio
Una tienda necesita almacenar los precios de cinco productos.
    Desarrolla un programa que:
        Cree un array para almacenar los precios.
        Solicite los cinco precios al usuario.
        Muestre todos los precios.
        Permita modificar el precio de un producto indicando su posición.
        Muestre el listado actualizado.
        Controla que la posición introducida sea válida.

*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;


import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] precios = new double[5];

        // Pedir los precios
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un precio:");
            precios[i] = teclado.nextDouble();
        }

        // Mostrar precios
        for (int i = 0; i < 5; i++) {
            System.out.println(precios[i]);
        }

        // Cambiar un precio
        System.out.println("¿Qué producto quieres cambiar? (1-5)");
        int posicion = teclado.nextInt();

        if (posicion >= 1 && posicion <= 5) {
            System.out.println("Introduce el nuevo precio:");
            precios[posicion - 1] = teclado.nextDouble();
        } else {
            System.out.println("Posición incorrecta");
        }

        // Mostrar precios nuevos
        System.out.println("PRECIOS ACTUALIZADOS");

        for (int i = 0; i < 5; i++) {
            System.out.println(precios[i]);
        }
    }
}

