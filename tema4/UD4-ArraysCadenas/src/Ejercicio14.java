/*
Disponemos del siguiente array:
int[] numeros = {2, 5, 2, 8, 2, 9, 5, 2};
Desarrolla un programa que:
    Busque cuántas veces aparece el número 2.
    Muestre el resultado.
    Permita cambiar el número buscado.

*/

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crear un array de enteros.
        int[] numeros = {2, 5, 2, 8, 2, 9, 5, 2};
        
        // Meter el numero que quiera buscar entre esos 
        System.out.println("Introduce el número que quieras buscar (2, 5, 8, 9)");
        int buscar = teclado.nextInt();

        // Un contador para contar cuantas veces esta ese numero
        int contador = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                contador++;
            }
        }
        System.out.println("El numero aparece " + contador + " veces.");
    }
}
