/*
9. Calculadora básica:
Crear un programa que realice las cuatro operaciones básicas (suma,
resta, multiplicación y división) según la opción que seleccione el
usuario.
*/


import java.util.Scanner; // Importamos Scanner para leer datos por teclado.

public class ejercicio9 { // Declaramos la clase principal del programa.

    public static void main(String[] args) { // Método principal donde comienza la ejecución.

        Scanner teclado = new Scanner(System.in); // Creamos un Scanner para leer los datos.

        System.out.println("Introduce el primer número:"); // Pedimos el primer número.
        double numero1 = teclado.nextDouble(); // Leemos el primer número y lo guardamos.

        System.out.println("Introduce el segundo número:"); // Pedimos el segundo número.
        double numero2 = teclado.nextDouble(); // Leemos el segundo número y lo guardamos.

        System.out.println("Selecciona una operación:"); // Mostramos el menú de operaciones.
        System.out.println("1. Suma"); // Opción 1: sumar.
        System.out.println("2. Resta"); // Opción 2: restar.
        System.out.println("3. Multiplicación"); // Opción 3: multiplicar.
        System.out.println("4. División"); // Opción 4: dividir.

        int opcion = teclado.nextInt(); // Leemos la opción elegida por el usuario.

        if (opcion == 1) { // Comprobamos si el usuario ha elegido la suma.
            System.out.println("Resultado: " + (numero1 + numero2)); // Sumamos los dos números.

        } else if (opcion == 2) { // Comprobamos si ha elegido la resta.
            System.out.println("Resultado: " + (numero1 - numero2)); // Restamos el segundo al primero.

        } else if (opcion == 3) { // Comprobamos si ha elegido la multiplicación.
            System.out.println("Resultado: " + (numero1 * numero2)); // Multiplicamos los dos números.

        } else if (opcion == 4) { // Comprobamos si ha elegido la división.

            if (numero2 != 0) { // Comprobamos que el divisor no sea cero.
                System.out.println("Resultado: " + (numero1 / numero2)); // Dividimos el primer número entre el segundo.
            } else { // Si el segundo número es cero, no podemos realizar la división.
                System.out.println("Error: no se puede dividir entre cero."); // Mostramos el mensaje de error.
            } // Cerramos la comprobación de la división entre cero.

        } else { // Si la opción no es del 1 al 4.
            System.out.println("Opción no válida."); // Informamos de que la opción es incorrecta.
        } // Cerramos la estructura condicional principal.

        teclado.close(); // Cerramos el Scanner al terminar.
    } // Cerramos el método main.
} // Cerramos la clase Calculadora.
