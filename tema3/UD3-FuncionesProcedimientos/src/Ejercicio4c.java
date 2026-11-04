/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maitane Navarro
 */


import java.util.Scanner;

public class Ejercicio4c {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Multiplicar dos números enteros.
        System.out.println("--- MULTIPLICAR DOS ENTEROS ---");

        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();

        int resultado1 = Calculadora.multiplicar(num1, num2);

        System.out.println("Resultado: " + resultado1);


        // Multiplicar tres números enteros.
        System.out.println("\n--- MULTIPLICAR TRES ENTEROS ---");

        System.out.print("Introduce el primer número: ");
        int num3 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num4 = teclado.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num5 = teclado.nextInt();

        int resultado2 = Calculadora.multiplicar(num3, num4, num5);

        System.out.println("Resultado: " + resultado2);


        // Multiplicar dos números decimales.
        System.out.println("\n--- MULTIPLICAR DOS DECIMALES ---");

        System.out.print("Introduce el primer decimal: ");
        double decimal1 = teclado.nextDouble();

        System.out.print("Introduce el segundo decimal: ");
        double decimal2 = teclado.nextDouble();

        double resultado3 = Calculadora.multiplicar(decimal1, decimal2);

        System.out.println("Resultado: " + resultado3);

        teclado.close();
    }
}


// Clase Calculadora.
class Calculadora {

    // Multiplica dos números enteros.
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Multiplica tres números enteros.
    public static int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    // Multiplica dos números decimales.
    public static double multiplicar(double a, double b) {
        return a * b;
    }
}
