/*
Calcular la media de cinco números
Pide al usuario cinco números y calcula su media aritmética. Al terminar, muestra el resultado por pantalla.
Pista: utiliza un for, una variable acumuladora llamada suma y divide el resultado entre 5.0.

*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i<=5; i++) {
            System.out.println("Introduce un numero: ");
            int num = teclado.nextInt();
            suma +=num;
        }
        int media = (int) (suma / 5.0);
        System.out.println("la media de los numeros anteriores es: " + media);
    }
}