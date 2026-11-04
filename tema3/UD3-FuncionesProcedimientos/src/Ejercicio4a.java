/*
Desarrolla una clase Java llamada Calculadora que permita realizar diferentes operaciones matemáticas mediante métodos sobrecargados.
La calculadora deberá disponer de los siguientes métodos estáticos:
    multiplicar(int a, int b): devuelve el producto de dos números enteros.
    multiplicar(int a, int b, int c): devuelve el producto de tres números enteros.
    multiplicar(double a, double b): devuelve el producto de dos números decimales.
Todos los métodos deben llamarse multiplicar, pero cada uno tendrá una lista de parámetros diferente.
Crea también una clase Principal con un método main que invoque los tres métodos y muestre sus resultados.
    ¿Qué tienen en común los tres métodos?
    ¿En qué se diferencian sus listas de parámetros?
    ¿Cómo decide Java qué método debe ejecutar?
    ¿Qué sucedería si intentáramos declarar dos métodos multiplicar(int, int) con tipos de retorno diferentes?
    ¿Qué ventajas ofrece utilizar el mismo nombre para estas operaciones?

*/

/**
 *
 * @author Maitane Navarro
 */


import java.util.Scanner;
public class Ejercicio4a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Pedir el primer numero
        System.out.print("Mete el primer numero: ");
        int num1 = teclado.nextInt();
        
        // Pedir el segundo numero.
        System.out.print("Mete el segundo numero: ");
        int num2 = teclado.nextInt();
        
        // Mostrar la suma utilizando el metodo sumar
        System.out.println("Suma: " + sumar(num1, num2));
        
        // Mostrar la resta utilizando el metodo restar
        System.out.println("Resta: " + restar(num1, num2));
        
        // Mostrar la multiplicacion utilizando el metodo multiplicar
        System.out.println("Multiplicacion: " + multiplicar(num1, num2));
        
        // Comprobar que el segundo numero no sea cero
        if (num2 != 0) {
            // Mostrar la division utilizando el metodo dividir
           System.out.println("Division: " + dividir(num1, num2));
        // Si el segundo numero es cero, mostrar un mensaje de error
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
    
    // metodo que recibe dos números y devuelve su suma
    public static int sumar(int a, int b) {
        // Devolver la suma de los dos números
        return a + b;
    }
    // metodo que recibe dos numeros y devuelve su resta
    public static int restar(int a, int b) {
        // Devolvemos la resta de los dos números
        return a - b;
    }
    // metodo que recibe dos numeros y devuelve su multiplicación
    public static int multiplicar(int a, int b) {
        // Devolvemos la multiplicación de los dos números
        return a * b;
    }
    // metodo que recibe dos numeros y devuelve su división entera
    public static int dividir(int a, int b) {
        // Devolvemos el resultado de dividir el primer numero entre el segundo
        return a / b;
    }
}