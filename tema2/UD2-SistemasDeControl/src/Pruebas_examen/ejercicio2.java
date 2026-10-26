/*
Declara un entero dia del 1 al 7 y muestra el nombre del día correspondiente. Si no está entre 1 y 7, muestra «Día no válido».
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       // Pedir el número al usuario
       System.out.print("Introduce un número entero: ");
        int dia = teclado.nextInt();
        
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido. Introduce un número del 1 al 7.");
        }
                 
        }
    }

