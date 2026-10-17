/**
 *
 * @author Maitane Navarro
 */


/* 2. Suma 2 números: Escribe un programa que sume dos números enteros
introducidos por teclado y muestre el resultado por pantalla. Utiliza variables para
cada número.*/ 

import java.util.Scanner; // Importamos Scanner para leer datos por teclado.

public class ejercicio2 { // Declaramos la clase principal del programa.

    public static void main(String[] args) { // Método principal: aquí comienza la ejecución.

        Scanner teclado = new Scanner(System.in); // Creamos un Scanner para leer los datos introducidos.

        System.out.println("Introduce el primer número:"); // Pedimos el primer número al usuario.

        int numero1 = teclado.nextInt(); // Leemos el primer entero y lo guardamos en numero1.

        System.out.println("Introduce el segundo número:"); // Pedimos el segundo número al usuario.

        int numero2 = teclado.nextInt(); // Leemos el segundo entero y lo guardamos en numero2.

        int suma = numero1 + numero2; // Sumamos los dos números y guardamos el resultado en suma.

        System.out.println("El resultado de la suma es: " + suma); // Mostramos el resultado por pantalla.

        teclado.close(); // Cerramos el Scanner porque ya hemos terminado de leer datos.
    } // Cerramos el método main.
} // Cerramos la clase SumaNumeros.
