/*
Comprobar si un número es múltiplo de otro
Pide al usuario dos números enteros e indica si el primero es múltiplo del segundo.
Pista: utiliza Scanner, if, else y el operador %. Comprueba que el segundo número no sea cero.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
            System.out.println("Introduce un numero: ");
            num = teclado.nextInt();
            
            System.out.println("Introduce otro numero: ");
            num2 = teclado.nextInt();
            
             if (num2 != 0) {
            if (num % num2 == 0) {
                System.out.println("El primer número es múltiplo del segundo.");
            } else {
                System.out.println("El primer número no es múltiplo del segundo.");
            }
        } else {
            System.out.println("Error: el segundo número no puede ser cero.");
        }
            
    }
}

