/*

Intermedio
Crea un programa que almacene las notas de diez alumnos.
El programa debe calcular:
    Número de suspensos (nota menor que 5).
    Número de aprobados (nota entre 5 y menos de 7).
    Número de notables (nota entre 7 y menos de 9).
    Número de sobresalientes (nota igual o superior a 9).
    Porcentaje de aprobados.
Comprueba que la suma de todas las categorías coincide con el número de alumnos.


*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Creacion array y contadores
        double[] notas = new double[10];
        
            int suspensos = 0;
            int aprobados = 0;
            int notables = 0;
            int sobresalientes = 0;
            
        // Crea un programa que almacene las notas de diez alumnos
        for (int i = 0; i < 10; i++){
            System.out.println("Introduce la nota del alumno " + (i + 1) + ":");
            notas[i] = teclado.nextDouble();

            // clasificar las notas segun lo metido
            if (notas[i] < 5) {
                suspensos++;

            } else if (notas[i] < 7) {
                aprobados++;

            } else if (notas[i] < 9) {
                notables++;

            } else {
                sobresalientes++;
        }
    }
           
            
        // Calculamos el porcentaje de aprobados
        double porcentaje = (aprobados + notables + sobresalientes) * 100.0 / 10;
        
        // Número de suspensos (menos de 5).
        System.out.println("Suspensos: " + suspensos);
        // Número de aprobados (nota entre 5 y menos de 7).
        System.out.println("Aprobados: " + aprobados);
        // Número de notables (nota entre 7 y menos de 9).
        System.out.println("Notables: " + notables);
        // Número de sobresalientes (nota igual o superior a 9).
        System.out.println("Sobresalientes: " + sobresalientes);
        // Porcentaje de aprobados.
        System.out.println("Porcentaje de aprobados: " + porcentaje + "%");
     
        // Comprobamos que la suma sea 10
        int total = suspensos + aprobados + notables + sobresalientes;

        System.out.println("Total de alumnos: " + total);

        if (total == 10) {
            System.out.println("La comprobación es correcta");
        } else {
            System.out.println("Hay algún error");
        }
    }
}
