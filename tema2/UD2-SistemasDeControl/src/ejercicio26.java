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
public class ejercicio26 {

    // Este es el método principal, donde comienza el programa.
    public static void main(String[] args) {

        // Creamos el Scanner para leer los datos del teclado.
        Scanner teclado = new Scanner(System.in);

        // Declaramos las variables a y b como números enteros.
        int a, b;

        // Pedimos al usuario que introduzca dos números mayores que cero.
        System.out.println("Introduzca dos numeros mayores que 0:");

        // Leemos el primer número y lo guardamos en a.
        a = teclado.nextInt();

        // Leemos el segundo número y lo guardamos en b.
        b = teclado.nextInt();

        // Comprobamos que los dos números sean positivos.
        if (a <= 0 || b <= 0) {

            // Mostramos un mensaje si alguno de los números no es válido.
            System.out.println("Los dos numeros deben ser mayores que 0.");

        // Si ambos números son positivos, comenzamos el algoritmo.
        } else {

            // Repetimos las operaciones mientras b sea distinto de cero.
            while (b != 0) {

                // Si a es mayor que b, restamos b a a.
                if (a > b) {
                    a = a - b;

                // Si a no es mayor que b, restamos a a b.
                } else {
                    b = b - a;
                }
            }

            // Cuando b llega a cero, a contiene el máximo común divisor.
            System.out.println(a);
        }

        // Cerramos el Scanner.
        teclado.close();
    }
}

