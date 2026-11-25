/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maitane Navarro
 */

// Clase de operaciones con arrays
public class Ejercicio17ForEach {

    // Método para mostrar los números
    public static void mostrar(int[] numeros) {
        // Recorre cada número del array
        for (int num : numeros) {
            // Muestra el número
            System.out.println(num);
        }
    }

    // Método para sumar los números
    public static int sumar(int[] numeros) {
        // Variable para guardar la suma
        int suma = 0;

        // Recorre cada número
        for (int num : numeros) {
            // Suma el número
            suma = suma + num;
        }

        // Devuelve la suma
        return suma;
    }

    // Método para calcular la media
    public static double calcularMedia(int[] numeros) {
        // Divide la suma entre la cantidad de números
        return (double) sumar(numeros) / numeros.length;
    }

    // Método para obtener el máximo
    public static int obtenerMaximo(int[] numeros) {
        // Guardamos el primer número como máximo
        int maximo = numeros[0];

        // Recorremos los números
        for (int num : numeros) {
            // Comprobamos si es mayor
            if (num > maximo) {
                maximo = num;
            }
        }

        // Devolvemos el máximo
        return maximo;
    }

    // Método para contar los pares
    public static int contarPares(int[] numeros) {
        // Contador de pares
        int pares = 0;

        // Recorremos los números
        for (int num : numeros) {
            // Comprobamos si es par
            if (num % 2 == 0) {
                pares++;
            }
        }

        // Devolvemos los pares
        return pares;
    }

    // Método para buscar un número
    public static int buscar(int[] numeros, int valor) {
        // Recorremos el array
        for (int i = 0; i < numeros.length; i++) {
            // Comprobamos si encontramos el número
            if (numeros[i] == valor) {
                // Devolvemos su posición
                return i;
            }
        }

        // Si no existe, devolvemos -1
        return -1;
    }
}

// Clase principal
class Main {

    // Método principal
    public static void main(String[] args) {

        // Creamos el array
        int[] numeros = {2, 4, 6, 8, 10};

        // Mostramos los números
        Ejercicio17ForEach.mostrar(numeros);

        // Mostramos la suma
        System.out.println("Suma: " + Ejercicio17ForEach.sumar(numeros));

        // Mostramos la media
        System.out.println("Media: " + Ejercicio17ForEach.calcularMedia(numeros));

        // Mostramos el máximo
        System.out.println("Maximo: " + Ejercicio17ForEach.obtenerMaximo(numeros));

        // Mostramos los pares
        System.out.println("Pares: " + Ejercicio17ForEach.contarPares(numeros));

        // Buscamos el número 6
        System.out.println("Posicion: " + Ejercicio17ForEach.buscar(numeros, 6));
    }
}
