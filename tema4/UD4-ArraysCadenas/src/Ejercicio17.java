/*
 
Biblioteca de operaciones sobre arrays
Crea una clase OperacionesArray con los siguientes métodos estáticos:
    mostrar(int[] numeros): muestra todos los elementos.
    sumar(int[] numeros): devuelve la suma.
    calcularMedia(int[] numeros): devuelve la media.
    obtenerMaximo(int[] numeros): devuelve el mayor elemento.
    contarPares(int[] numeros): devuelve cuántos números pares hay.
    Desde main, crea un array de números y llama a todos los métodos.
Ampliación: añade un método que reciba un array y un valor, y devuelva la posición de su primera aparición. Si no existe, devolverá -1.


*/

/**
 *
 * @author 06_1DAW
 */


public class Ejercicio17 {

    // Método para mostrar los números
    public static void mostrar(int[] numeros) {
        // Recorre todos los números
        for (int i = 0; i < numeros.length; i++) {
            // Muestra el número
            System.out.println(numeros[i]);
        }
    }
    // Método para sumar los números
    public static int sumar(int[] numeros) {
        // Variable para guardar la suma
        int suma = 0;
        // Recorre el array
        for (int i = 0; i < numeros.length; i++) {
            // Suma cada número
            suma = suma + numeros[i];
        }
        // Devuelve la suma
        return suma;
    }

    // Método para calcular la media
    public static double calcularMedia(int[] numeros) {
        // Divide la suma entre la cantidad de números
        return (double) sumar(numeros) / numeros.length;
    }
    // Método para obtener el número máximo
    public static int obtenerMaximo(int[] numeros) {
        // Suponemos que el primer número es el mayor
        int maximo = numeros[0];
        // Recorremos el array
        for (int i = 0; i < numeros.length; i++) {
            // Comprobamos si hay un número mayor
            if (numeros[i] > maximo) {
                // Guardamos el nuevo máximo
                maximo = numeros[i];
            }
        }
        // Devolvemos el número mayor
        return maximo;
    }
    // Método para contar los números pares
    public static int contarPares(int[] numeros) {
        // Contador de números pares
        int pares = 0;
        // Recorremos el array
        for (int i = 0; i < numeros.length; i++) {
            // Comprobamos si el número es par
            if (numeros[i] % 2 == 0) {
                // Aumentamos el contador
                pares++;
            }
        }
        // Devolvemos la cantidad de pares
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

// Clase principal del programa
class Main {

    // Método principal
    public static void main(String[] args) {
        // Creamos un array de números
        int[] numeros = {2, 4, 6, 8, 10};
        // Mostramos los números
        Ejercicio17.mostrar(numeros);
        // Mostramos la suma
        System.out.println("Suma: " + Ejercicio17.sumar(numeros));
        // Mostramos la media
        System.out.println("Media: " + Ejercicio17.calcularMedia(numeros));
        // Mostramos el número máximo
        System.out.println("Maximo: " + Ejercicio17.obtenerMaximo(numeros));
        // Mostramos cuántos pares hay
        System.out.println("Pares: " + Ejercicio17.contarPares(numeros));
        // Buscamos el número 6 y mostramos su posición
        System.out.println("Posicion: " + Ejercicio17.buscar(numeros, 6));
    }
}
