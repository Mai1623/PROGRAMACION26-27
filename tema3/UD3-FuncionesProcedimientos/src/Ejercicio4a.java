
/*
Calculadora modular
crear una clase con metodos para:
- sumar
- restar
- multiplicar
- dividir

para la division, se debe decidir como tratar el divisor cero.
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Ejercicio4a {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos el primer número
        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();

        // Pedimos el segundo número
        System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();

        // Llamamos al procedimiento mostrarResultados
        mostrarResultados(num1, num2);

        teclado.close();
    }

    // FUNCIÓN: devuelve la suma de dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // FUNCIÓN: devuelve la resta de dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // FUNCIÓN: devuelve la multiplicación de dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // FUNCIÓN: devuelve la división de dos números
    public static double dividir(int a, int b) {
        return (double) a / b;
    }

    // PROCEDIMIENTO: muestra todos los resultados
    public static void mostrarResultados(int num1, int num2) {

        System.out.println("Suma: " + sumar(num1, num2));

        System.out.println("Resta: " + restar(num1, num2));

        System.out.println("Multiplicación: " + multiplicar(num1, num2));

        // Comprobamos que no se divida entre cero
        if (num2 != 0) {
            System.out.println("División: " + dividir(num1, num2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}
