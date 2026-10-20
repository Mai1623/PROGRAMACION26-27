/*
 Escribe un algoritmo que a partir de tres calificaciones, calcule la media ponderada (nota1 20%, nota2 50% y nota3 30%), y a partir de la media, indique si el alumno está aprobado o no
*/

/**
 *
 * @author Maitane
 */

import java.util.Scanner;

public class repaso2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos la primera nota
        System.out.println("Introduce la primera nota:"); 
        double nota1 = teclado.nextDouble(); 
        
        // Pedimos la segunda nota
        System.out.println("Introduce la primera nota:"); 
        double nota2 = teclado.nextDouble();
        
        // Pedimos la tercera nota
        System.out.println("Introduce la primera nota:"); 
        double nota3 = teclado.nextDouble();
        
        int notamedia = (int) ((nota1 + nota2 + nota3)/3);
        System.out.println("La nota media es: " + notamedia); 
 
        if (notamedia >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
        teclado.close();
        }
    }
