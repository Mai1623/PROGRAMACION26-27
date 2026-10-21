/*
Crea un programa que simule un cajero automático utilizando un bucle infinito
(while(true)). El programa debe pedirle al usuario por consola que introduzca
un número para elegir una opción. Si el usuario introduce el número 3, el
programa debe despedirse y romper el bucle para terminar.
Requisitos:
    Usa la clase Scanner para leer los datos del usuario.
        Si introduce 1, imprime "Mostrando saldo...".
        Si introduce 2, imprime "Retirando dinero...".
        Si introduce 3, imprime "Gracias por usar el cajero. ¡Adiós!" y termina el bucle de inmediato.
    💡 Pista para el Ejercicio 17
Declara el Scanner antes del bucle. Dentro del while (true), usa if (opcion == 3)
y coloca la palabra clave break; dentro de ese bloque condicional.

*/

/**
 *
 * @author Maitane
 */

import java.util.Scanner; 

public class ejercicio16 { 

    public static void main(String[] args) { 

        Scanner teclado = new Scanner(System.in); 

        // Creamos un bucle infinito que se repetirá hasta ejecutar break
        while (true) { 
            System.out.println("=== CAJERO AUTOMÁTICO ==="); 
            System.out.println("1. Consultar saldo"); 
            System.out.println("2. Retirar dinero"); 
            System.out.println("3. Salir"); 
            System.out.print("Elige una opción: "); 

            // Leemos el número por teclado
            int opcion = teclado.nextInt(); 

            // Comprueba si ha elegido la opción 1
            if (opcion == 1) { 
                System.out.println("Mostrando saldo...");

            // Comprueba si ha elegido la opción 2
            } else if (opcion == 2) { 
                System.out.println("Retirando dinero...");

            // Comprueba si ha elegido la opción 3
            } else if (opcion == 3) { 
                System.out.println("Gracias por usar el cajero. ¡Aguuuur!");
            
            // Cerrar el bucle y terminar bucle
                break;
            
            // Si no se ejecuta ninguna de las 3 opciones
            } else { 
                System.out.println("Opción no válida. Inténtalo de nuevo."); 

            }
        }
    }

}
