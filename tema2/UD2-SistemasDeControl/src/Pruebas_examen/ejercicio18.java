/*
Clasificar un número
Pide al usuario un número entero e indica si es positivo, negativo o cero. Si es positivo, indica también si es par o impar.
Pista: utiliza if, else if, else y el operador %.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();
        if (num > 0){
            System.out.println("El numero " + num + " es positivo");
            if (num % 2 == 0){
                System.out.println("El numero " + num + " es par");
            } else {
                System.out.println("El numero " + num + " es impar");
            }
        } else if (num == 0 ){
            System.out.println("El numero " + num + " es cero");
        } else {
            System.out.println("El numero " + num + " es negativo");
        }
        
    }

}
