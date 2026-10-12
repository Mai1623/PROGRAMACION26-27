/*
Escribir un programa que solicite las notas del primer, segundo y tercer 
trimestre (notas enteras que se soliciaran  al usuario).

El programa debe mostrar la nota media del curso como aparece en el boletin
de calificaciones (solo la parte entera) y como se usa en el expediente 
academico (con decimales).
 */


import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedir las notas de los tres trimestres
        System.out.print("Introduce la nota del primer trimestre: ");
        int nota1 = teclado.nextInt();

        System.out.print("Introduce la nota del segundo trimestre: ");
        int nota2 = teclado.nextInt();

        System.out.print("Introduce la nota del tercer trimestre: ");
        int nota3 = teclado.nextInt();

        // Calcular la nota media con decimales
        double media = (nota1 + nota2 + nota3) / 3.0;

        // Mostrar la nota del boletín (solo parte entera)
        System.out.println("Nota media en el boletín: " + (int) media);

        // Mostrar la nota del expediente académico (con decimales)
        System.out.println("Nota media en el expediente académico: " + media);

        teclado.close();
    }
}
