/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Prueba4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedir el primer número.
        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();

        // Pedir el segundo número.
        System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();

        // Pedir el tercer número.
        System.out.print("Introduce el tercer número: ");
        int num3 = teclado.nextInt();

        // Mostrar las operaciones disponibles.
        System.out.println("\nElige una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar dos enteros");
        System.out.println("4. Dividir");
        System.out.println("5. Multiplicar tres enteros");
        System.out.println("6. Multiplicar dos decimales");

        // Leer la operación elegida.
        System.out.print("Opción: ");
        int opcion = teclado.nextInt();

        // Comprobar qué operación ha elegido el usuario.
        switch (opcion) {

            case 1:
                System.out.println("Resultado: " + sumar(num1, num2));
                break;

            case 2:
                System.out.println("Resultado: " + restar(num1, num2));
                break;

            case 3:
                System.out.println("Resultado: " + multiplicar(num1, num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + dividir(num1, num2));
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;

            case 5:
                System.out.println("Resultado: " + multiplicar(num1, num2, num3));
                break;

            case 6:
                System.out.print("Introduce el primer decimal: ");
                double decimal1 = teclado.nextDouble();

                System.out.print("Introduce el segundo decimal: ");
                double decimal2 = teclado.nextDouble();

                System.out.println("Resultado: " + multiplicar(decimal1, decimal2));
                break;

            default:
                System.out.println("Opción no válida.");
        }

        teclado.close();
    }

    // Método que suma dos números.
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método que resta dos números.
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método que multiplica dos enteros.
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método que multiplica tres enteros.
    public static int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    // Método que multiplica dos decimales.
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método que divide dos números enteros.
    public static int dividir(int a, int b) {
        return a / b;
    }
}
