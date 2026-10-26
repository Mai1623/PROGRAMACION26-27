/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maitane
 */

import java.util.Scanner;

// Creamos la clase principal del programa.
public class ejercicio261 {

    // Este es el método principal, donde comienza la ejecución.
    public static void main(String[] args) {

        // Creamos un Scanner para leer los datos que introduce el usuario.
        Scanner teclado = new Scanner(System.in);

        // Mostramos un mensaje para pedir el número.
        System.out.print("Ingrese el numero: ");

        // Leemos el número introducido y lo guardamos en la variable N.
        int N = teclado.nextInt();

        // Mostramos un mensaje para pedir el divisor.
        System.out.print("Ingrese el divisor: ");

        // Leemos el divisor introducido y lo guardamos en la variable M.
        int M = teclado.nextInt();

        // Comprobamos que el divisor no sea cero para evitar un error.
        if (M == 0) {

            // Informamos al usuario de que no se puede dividir entre cero.
            System.out.println("El divisor no puede ser cero.");

        // Si el divisor no es cero, comprobamos si la división es exacta.
        } else if (N % M == 0) {

            // Si el resto es cero, M es divisor exacto de N.
            System.out.println(M + " es divisor exacto de " + N + ".");

        // Si el resto no es cero, la división no es exacta.
        } else {

            // Mostramos el resto de dividir N entre M.
            System.out.println("El resto de dividir " + N + " por " + M
                    + " es: " + (N % M));
        }

        // Cerramos el Scanner porque ya no necesitamos leer más datos.
        teclado.close();
    }
}
