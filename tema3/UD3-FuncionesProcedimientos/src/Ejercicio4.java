/*
Calculadora modular
crear una clase con metodos para:
- sumar
- restar
- multiplicar
- dividir
*/

/**
 *
 * @author Maitane Navarro
 */


import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos el primer número
        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();

        // Pedimos el segundo número.
        System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();

        // Mostramos la suma utilizando el método sumar
        System.out.println("Suma: " + sumar(num1, num2));

        // Mostramos la resta utilizando el método restar
        System.out.println("Resta: " + restar(num1, num2));

        // Mostramos la multiplicación utilizando el método multiplicar
        System.out.println("Multiplicación: " + multiplicar(num1, num2));

        // Comprobamos que el segundo número no sea cero
        if (num2 != 0) {

            // Mostramos la división utilizando el método dividir
            System.out.println("División: " + dividir(num1, num2));

        // Si el segundo número es cero, mostramos un mensaje de error
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }

    // Método que recibe dos números y devuelve su suma
    public static int sumar(int a, int b) {

        // Devolvemos la suma de los dos números
        return a + b;
    }

    // Método que recibe dos números y devuelve su resta
    public static int restar(int a, int b) {

        // Devolvemos la resta de los dos números
        return a - b;
    }

    // Método que recibe dos números y devuelve su multiplicación
    public static int multiplicar(int a, int b) {

        // Devolvemos la multiplicación de los dos números
        return a * b;
    }

    // Método que recibe dos números y devuelve su división entera
    public static int dividir(int a, int b) {

        // Devolvemos el resultado de dividir el primer número entre el segundo
        return a / b;
    }
}
