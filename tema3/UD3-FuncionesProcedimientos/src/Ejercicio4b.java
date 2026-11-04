/*
Calculadora modular
    crear una clase con metodos para:
    - sumar
    - restar
    - multiplicar
    - dividir
Eligiendo el usuario que quiere hacer con un switch 
*/

/**
 *
 * @author Maitane Navarro
 */



import java.util.Scanner;

public class Ejercicio4b {

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

        // Convertir los números enteros a decimales mediante casting.
        double decimal1 = (double) num1;
        double decimal2 = (double) num2;
        double decimal3 = (double) num3;

        // Mostrar las operaciones disponibles.
        System.out.println("\nElige una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar dos números");
        System.out.println("4. Dividir");
        System.out.println("5. Multiplicar tres números");
        System.out.println("6. Multiplicar dos decimales");

        // Leer la operación elegida.
        System.out.print("Opción: ");
        int opcion = teclado.nextInt();

        // Comprobar qué operación ha elegido.
        switch (opcion) {

            case 1:
                System.out.println("Resultado: " + sumar(decimal1, decimal2));
                break;

            case 2:
                System.out.println("Resultado: " + restar(decimal1, decimal2));
                break;

            case 3:
                System.out.println("Resultado: " + multiplicar(decimal1, decimal2));
                break;

            case 4:
                if (decimal2 != 0) {
                    System.out.println("Resultado: " + dividir(decimal1, decimal2));
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;

            case 5:
                System.out.println("Resultado: " + multiplicar(decimal1, decimal2, decimal3));
                break;

            case 6:
                System.out.print("Introduce el primer decimal: ");
                double decimal4 = teclado.nextDouble();

                System.out.print("Introduce el segundo decimal: ");
                double decimal5 = teclado.nextDouble();

                System.out.println("Resultado: " + multiplicar(decimal4, decimal5));
                break;

            default:
                System.out.println("Opción no válida.");
        }

        teclado.close();
    }

    // Método que suma dos números decimales.
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método que resta dos números decimales.
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método que multiplica dos números decimales.
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método que multiplica tres números decimales.
    public static double multiplicar(double a, double b, double c) {
        return a * b * c;
    }

    // Método que divide dos números decimales.
    public static double dividir(double a, double b) {
        return a / b;
    }
}
