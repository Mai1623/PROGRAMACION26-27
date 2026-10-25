/*
Escribe un programa que muestre los números del 1 al 10 y, al terminar, muestre la suma total.
*/

package Pruebas_examen;

/**
 *
 * @author Maitane Navarro
 */
public class ejercicio3 {
    public static void main(String[] args) {
        int suma = 0;
        for (int num = 1; num <= 10 ; num++){
            System.out.println(num);
            suma = suma + num;  
        }
        System.out.println("La suma total es: " + suma);
    }
}
