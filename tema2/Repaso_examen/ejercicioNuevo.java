/*
Crea un programa que gestione las notas de un alumno en 5 asignaturas.
*/
package Pruebas_examen;

/**
 *
 * @author 06_1DAW
 */

import java.util.Scanner;

public class ejercicioNuevo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la primera nota:");
        int nota1 = teclado.nextInt();

        System.out.println("Introduce la segunda nota:");
        int nota2 = teclado.nextInt();

        System.out.println("Introduce la tercera nota:");
        int nota3 = teclado.nextInt();

        int aprobados = 0;
        int suspensos = 0;

        if (nota1 >= 5) {
            aprobados++;
        } else {
            suspensos++;
        }

        if (nota2 >= 5) {
            aprobados++;
        } else {
            suspensos++;
        }

        if (nota3 >= 5) {
            aprobados++;
        } else {
            suspensos++;
        }

        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Media: " + media);

        switch (suspensos) {
            case 0:
                System.out.println("Todo aprobado");
                break;
            case 1:
                System.out.println("Un suspenso");
                break;
            default:
                System.out.println("Varios suspensos");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                continue;
            }
            if (k == 5) {
                break;
            }
            System.out.println(k);
        }
    }
}
