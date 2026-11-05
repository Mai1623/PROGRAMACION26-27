/*
Amplia el ejercicio de la calculadora para incluir la operación de la potencia y la raíz cuadrada.

Utiliza las funciones predefinidas.

Si la función no está incluida por defecto en el lenguaje, importa el módulo que necesites.

*/

/**
 *
 * @author Maitane Navarro
 */



import java.util.Scanner;

public class Ejercicio7 {

    // Creamos el Scanner para introducir datos por teclado
    static Scanner teclado = new Scanner(System.in);

    // Metodo para sumar dos numeros
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Metodo para restar dos numeros
    public static double restar(double a, double b) {
        return a - b;
    }

    // Metodo para multiplicar dos numeros
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Metodo para dividir dos numeros
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre cero");
            return 0;
        } else {
            return a / b;
        }
    }

    // Metodo para calcular la potencia
    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    // Metodo para calcular la raiz cuadrada
    public static double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    // Metodo principal del programa
    public static void main(String[] args) {

        // Pedimos dos numeros
        System.out.println("Introduce el primer numero:");
        double a = teclado.nextDouble();

        System.out.println("Introduce el segundo numero:");
        double b = teclado.nextDouble();

        // Mostramos los resultados
        System.out.println("Suma: " + sumar(a, b));

        System.out.println("Resta: " + restar(a, b));

        System.out.println("Multiplicacion: " + multiplicar(a, b));

        System.out.println("Division: " + dividir(a, b));

        System.out.println("Potencia: " + potencia(a, b));

        // Calculamos la raiz cuadrada del primer numero
        if (a >= 0) {
            System.out.println("Raiz cuadrada del primer numero: " + raizCuadrada(a));
        } else {
            System.out.println("No se puede calcular la raiz cuadrada de un numero negativo");
        }

        teclado.close();
    }
}
