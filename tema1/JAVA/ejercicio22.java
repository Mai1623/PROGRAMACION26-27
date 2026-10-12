/** Realizar una aplicacion que solicite al usuario su edad y le indque si es mayor
de edad (mediante un literal booleano: true o false). */

import java.util.Scanner;
public class ejercicio22 {
    public static void main(String[] args) {
        //Introducir por teclado
        Scanner teclado = new Scanner(System.in);

        //Imprimir el mensaje
        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        //Comprobacion si es mayor de edad según el dato metido
        boolean mayorDeEdad = edad >= 18;

        //Imprime si es true (si es mayor) o false (si es menor)
        System.out.println("¿Es mayor de edad? " + mayorDeEdad);

        teclado.close();
    }
}

