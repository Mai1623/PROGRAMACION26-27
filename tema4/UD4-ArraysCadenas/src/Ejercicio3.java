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

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Cree un array para almacenar los precios
        double [] precios = new double [5];
        
        // Solicite los cinco precios al usuario
        for (int i = 0; i < precios.length; i++){
            System.out.println("Introduce el precio del producto " + (i + 1) + ":");
            precios[i] = teclado.nextDouble();
        }
        // Muestre todos los precios
        System.out.println("Listado de precios");
        
        for (int i = 0; i < precios.length; i++){
            System.out.println("Producto " + (i + 1 ) + ": " + precios[i] + " €");
        }
        
        // Permita modificar el precio de un producto indicando su posición
        System.out.println("Modifica un producto del 1 al 5");
        int posicion = teclado.nextInt();
        
        // Muestre el listado actualizado
        System.out.println("\nLISTADO ACTUALIZADO");

        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + precios[i] + " euros");
        }
        // Controla que la posición introducida sea válida
        if (posicion >= 1 && posicion <= 5) {

            System.out.println("Introduce el nuevo precio:");
            double nuevoPrecio = teclado.nextDouble();

            precios[posicion - 1] = nuevoPrecio;

            System.out.println("Precio modificado correctamente.");

        } else {
            System.out.println("Error: posición no válida.");
        }
        
        // Muestre el listado actualizado
        System.out.println("\nLISTADO ACTUALIZADO");

        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + precios[i] + " euros");
        }
    }
    
}
