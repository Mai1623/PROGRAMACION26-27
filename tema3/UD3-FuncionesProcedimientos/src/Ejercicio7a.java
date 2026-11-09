

/*
Amplia el ejercicio de la calculadora para incluir la operación de la potencia y la raíz cuadrada.

Utiliza las funciones predefinidas.

Si la función no está incluida por defecto en el lenguaje, importa el módulo que necesites.

    CON SWITCH
*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner; 

public class Ejercicio7a { 

    static Scanner teclado = new Scanner(System.in);

    // Metodo para sumar dos numeros
    public static double sumar(double a, double b) {
        return a + b; // Devolvemos la suma de los dos numeros
    }

    // Metodo para restar dos numeros
    public static double restar(double a, double b) {
        return a - b; // Devolvemos la resta de los dos numeros
    }

    // Metodo para multiplicar dos numeros
    public static double multiplicar(double a, double b) {
        return a * b; // Devolvemos la multiplicacion de los dos numeros
    }

    // Metodo para dividir dos numeros
    public static double dividir(double a, double b) {

        // Comprobamos si el segundo numero es cero
        if (b == 0) {

            // Mostramos un mensaje de error
            System.out.println("No se puede dividir entre cero");

            // Devolvemos cero para terminar el metodo
            return 0;

        } else {

            // Devolvemos el resultado de la division
            return a / b;
        }
    }

    // Metodo para calcular la potencia
    public static double potencia(double a, double b) {
        return Math.pow(a, b); // Elevamos el primer numero al segundo
    }

    // Metodo para calcular la raiz cuadrada
    public static double raizCuadrada(double a) {
        return Math.sqrt(a); // Devolvemos la raiz cuadrada del numero
    }

    // Metodo principal del programa
    public static void main(String[] args) {

        // Pedimos el primer numero al usuario
        System.out.println("Introduce el primer numero:");

        // Guardamos el primer numero introducido
        double a = teclado.nextDouble();

        // Pedimos el segundo numero al usuario
        System.out.println("Introduce el segundo numero:");

        // Guardamos el segundo numero introducido
        double b = teclado.nextDouble();

        // Mostramos las opciones del menu
        System.out.println("ELIGE UNA OPERACION:");

        // Opcion para sumar
        System.out.println("1. Sumar");

        // Opcion para restar
        System.out.println("2. Restar");

        // Opcion para multiplicar
        System.out.println("3. Multiplicar");

        // Opcion para dividir
        System.out.println("4. Dividir");

        // Opcion para calcular la potencia
        System.out.println("5. Potencia");

        // Opcion para calcular la raiz cuadrada
        System.out.println("6. Raiz cuadrada");

        // Pedimos al usuario que elija una opcion
        int opcion = teclado.nextInt();

        // Comprobamos que opcion ha elegido el usuario
        switch (opcion) {

            // Si elige la opcion 1
            case 1:

                // Llamamos al metodo sumar y mostramos el resultado
                System.out.println("Suma: " + sumar(a, b));

                // Salimos del switch
                break;

            // Si elige la opcion 2
            case 2:

                // Llamamos al metodo restar y mostramos el resultado
                System.out.println("Resta: " + restar(a, b));

                // Salimos del switch
                break;

            // Si elige la opcion 3
            case 3:

                // Llamamos al metodo multiplicar y mostramos el resultado
                System.out.println("Multiplicacion: " + multiplicar(a, b));

                // Salimos del switch
                break;

            // Si elige la opcion 4
            case 4:

                // Llamamos al metodo dividir y mostramos el resultado
                System.out.println("Division: " + dividir(a, b));

                // Salimos del switch
                break;

            // Si elige la opcion 5
            case 5:

                // Llamamos al metodo potencia y mostramos el resultado
                System.out.println("Potencia: " + potencia(a, b));

                // Salimos del switch
                break;

            // Si elige la opcion 6
            case 6:

                // Comprobamos que el primer numero sea positivo o cero
                if (a >= 0) {

                    // Calculamos y mostramos la raiz cuadrada
                    System.out.println("Raiz cuadrada: " + raizCuadrada(a));

                } else {

                    // Mostramos un mensaje si el numero es negativo
                    System.out.println("No se puede calcular la raiz cuadrada de un numero negativo");
                }

                // Salimos del switch
                break;

            // Si el usuario introduce una opcion que no existe
            default:

                // Mostramos un mensaje de opcion incorrecta
                System.out.println("Opcion no valida");

                // Salimos del switch
                break;
        }
    }
}
