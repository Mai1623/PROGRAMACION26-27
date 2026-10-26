/*
Pide al usuario un número entero y muestra si es par o impar.

Pista: utiliza el operador %, que calcula el resto de una división. 
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       // Pedir el número al usuario
       System.out.print("Introduce un número entero: ");
        int num = teclado.nextInt();
        
       if (num % 2 == 0){
           System.out.println("El numero " + num + " es par.");
       }else
           System.out.println("El numero " + num + " es impar." );
    }

}
