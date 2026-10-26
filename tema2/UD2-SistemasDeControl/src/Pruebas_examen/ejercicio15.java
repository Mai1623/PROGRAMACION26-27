/*
Crear una calculadora básica

Pide dos números y una operación: suma, resta, multiplicación o división. Muestra el resultado.

También debes controlar que no se pueda dividir entre cero.

Pista: utiliza switch y recuerda que para divisiones decimales puedes usar double.
*/

package Pruebas_examen;

import java.util.Scanner;

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = teclado.nextDouble();

        System.out.print("Introduce la operación (+, -, *, /): ");
        char operacion = teclado.next().charAt(0);

        switch (operacion) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: no se puede dividir entre cero.");
                }
                break;

            default:
                System.out.println("Operación no válida.");
        }

        teclado.close();
    }
}