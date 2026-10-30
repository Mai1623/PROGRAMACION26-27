/*
Encontrar el número mayor y el menor
Pide al usuario cinco números enteros y muestra cuál es el mayor y cuál es el menor.
Pista: utiliza un for y dos variables, mayor y menor. Inicialízalas con el primer número introducido y compara los cuatro números restantes.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */


import java.util.Scanner;
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = teclado.nextInt();
        
        int mayor = num;
        int menor = num;
        
        for (int i = 2; i <= 5; i++) {
            System.out.println("Introduce un número:");
            num = teclado.nextInt();

            if (num > mayor) {
                mayor = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        teclado.close();
    }
}
