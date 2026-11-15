/*
Escribe un algoritmo que a partir de tres calificaciones, calcule la media
ponderada (nota1 20%, nota2 50% y nota3 30%), y a partir de la media, indique
si el alumno está aprobado o no.
*/

/**
 * @author Maitane Navarro
 */

package tema2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la primera nota: ");
        int nota1 = teclado.nextInt();
        
        System.out.println("Introduce la segunda nota: ");
        int nota2 = teclado.nextInt();
         
        System.out.println("Introduce la tercera nota: ");
        int nota3 = teclado.nextInt();
        
        int notamedia = ((nota1 + nota2 + nota3)/3);
        
        if (notamedia > 5){
            System.out.println("Esta aprobado");
        } else {
        System.out.println("Esta suspendido");
        }
    }
}
