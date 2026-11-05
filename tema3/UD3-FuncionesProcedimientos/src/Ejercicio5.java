/*
Ejercicio 5
Desarrolla una clase Java llamada Calculadora que permita realizar diferentes operaciones matemáticas mediante métodos sobrecargados.
La calculadora deberá disponer de los siguientes métodos estáticos:
    multiplicar(int a, int b): devuelve el producto de dos números enteros.
    multiplicar(int a, int b, int c): devuelve el producto de tres números enteros.
    multiplicar(double a, double b): devuelve el producto de dos números decimales.
Todos los métodos deben llamarse multiplicar, pero cada uno tendrá una lista de parámetros diferente.
Crea también una clase Ejercicio5 con un método main que invoque los tres métodos y muestre sus resultados.
    ¿Qué tienen en común los tres métodos?
    ¿En qué se diferencian sus listas de parámetros?
    ¿Cómo decide Java qué método debe ejecutar?
    ¿Qué sucedería si intentáramos declarar dos métodos multiplicar(int, int) con tipos de retorno diferentes?
    ¿Qué ventajas ofrece utilizar el mismo nombre para estas operaciones?

*/

/**
 *
 * @author Maitane 
 */
/**
 *
 * @author Maitane Navarro
 */


import java.util.Scanner;
class Calculadora {

    // Metodo que multiplica dos numeros enteros
    public static int multiplicar(int a, int b) {
        // Devolvemos el resultado de la multiplicacion
        return a * b;
    }

    // Metodo que multiplica tres numeros enteros
    public static int multiplicar(int a, int b, int c) {
        // Devolvemos el resultado de la multiplicacion
        return a * b * c;
    }

    // Metodo que multiplica dos numeros decimales
    public static double multiplicar(double a, double b) {
        // Devolvemos el resultado de la multiplicacion
        return a * b;
    }
}

// Creamos la clase principal del programa
public class Ejercicio5 {

    // Metodo principal desde donde comienza el programa
    public static void main(String[] args) {

        // Creamos el Scanner para leer los datos del teclado
        Scanner teclado = new Scanner(System.in);

        // Pedimos dos numeros enteros
        System.out.println("Introduce dos numeros enteros:");

        // Guardamos el primer numero
        int a = teclado.nextInt();

        // Guardamos el segundo numero
        int b = teclado.nextInt();

        // Multiplicamos los dos numeros y mostramos el resultado
        System.out.println("Resultado: " + Calculadora.multiplicar(a, b));

        // Pedimos tres numeros enteros
        System.out.println("\nIntroduce tres numeros enteros:");

        // Guardamos el primer numero
        a = teclado.nextInt();

        // Guardamos el segundo numero
        b = teclado.nextInt();

        // Guardamos el tercer numero
        int c = teclado.nextInt();

        // Multiplicamos los tres numeros y mostramos el resultado
        System.out.println("Resultado: " + Calculadora.multiplicar(a, b, c));

        // Pedimos dos numeros decimales
        System.out.println("\nIntroduce dos numeros decimales:");

        // Guardamos el primer numero decimal
        double x = teclado.nextDouble();

        // Guardamos el segundo numero decimal
        double y = teclado.nextDouble();

        // Multiplicamos los decimales y mostramos el resultado
        System.out.println("Resultado: " + Calculadora.multiplicar(x, y));
    }
}
