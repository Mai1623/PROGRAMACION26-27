/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maitane Navarro
 */

// Importamos Scanner para leer datos por teclado.
import java.util.Scanner;

// Creamos la clase Calculadora.
public class Prueba4 {

    // Método principal donde comienza el programa.
    public static void main(String[] args) {

        // Creamos el objeto para leer los datos.
        Scanner teclado = new Scanner(System.in);

        // Pedimos el primer número.
        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();

        // Pedimos el segundo número.
        System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();

        // Mostramos las operaciones disponibles.
        System.out.println("Elige una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        // Leemos la operación elegida por el usuario.
        System.out.print("Opción: ");
        int opcion = teclado.nextInt();

        // Comprobamos qué operación ha elegido el usuario.
        switch (opcion) {

            // Si elige 1, realizamos la suma.
            case 1:
                System.out.println("Resultado: " + sumar(num1, num2));
                break;

            // Si elige 2, realizamos la resta.
            case 2:
                System.out.println("Resultado: " + restar(num1, num2));
                break;

            // Si elige 3, realizamos la multiplicación.
            case 3:
                System.out.println("Resultado: " + multiplicar(num1, num2));
                break;

            // Si elige 4, comprobamos si se puede dividir.
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + dividir(num1, num2));
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;

            // Si elige una opción incorrecta, mostramos un mensaje.
            default:
                System.out.println("Opción no válida.");
        }

    }

    // Método que recibe dos números y devuelve su suma.
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método que recibe dos números y devuelve su resta.
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método que recibe dos números y devuelve su multiplicación.
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método que recibe dos números y devuelve su división entera.
    public static int dividir(int a, int b) {
        return a / b;
    }
}
