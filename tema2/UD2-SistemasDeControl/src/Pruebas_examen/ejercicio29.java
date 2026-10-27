/*
Pide un número entero y muestra su tabla de multiplicar del 1 al 10.
Por ejemplo, si introduce 3:
text
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
...
3 x 10 = 30
Pista: utiliza un for desde 1 hasta 10.
*/
package Pruebas_examen;

/**
 *
 * @author 06_1DAW
 */
import java.util.Scanner;
public class ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero del 1 al 10: ");
            int num = teclado.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num * i);
        }
    }
}
