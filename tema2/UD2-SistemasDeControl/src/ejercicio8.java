/*Calificacion: (Switch)
solicitar una nota numerica y mostrar la calificacion correspondiente
(Sobresaliente, notable, bien, suficiente, insuficiente) segun una escapa determinada.
*/
/* Calificaciones
0-4 insuficiente
5 suficiente
6 bien
7-8 notable
9-10 sobresaliente
*/
/**
 *
 * @author Maitane Navarro
 */


import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        // Iniciamos el Scanner
        Scanner teclado = new Scanner(System.in);

        // Pedimos un número al usuario
        System.out.print("Introduce una nota (0-10): ");

        // Guardamos el número introducido
        int numero = teclado.nextInt();

        // Comprobamos la nota introducida
        switch (numero) {
            // Del 0 al 4: Insuficiente
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            // Nota: 5
            case 5:
                System.out.println("Suficiente");
                break;
            // Nota: 6
            case 6:
                System.out.println("Bien");
                break;
            // Del 7 al 8: Notable
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            // Del 9 al 10: Sobresaliente
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            // Si la nota no está entre 0 y 10
            default:
                System.out.println("Nota no válida");
                break;
        }

        // Cerramos el Scanner
        teclado.close();
    }
}
