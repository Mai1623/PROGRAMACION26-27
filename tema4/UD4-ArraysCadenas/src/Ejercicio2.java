


/*
Temperaturas semanales
Nivel inicial
Una estación meteorológica almacena las temperaturas registradas durante cinco días.
    Crea un programa que:
        Declare un array de cinco números decimales.
        Solicite al usuario las cinco temperaturas mediante Scanner.
        Muestre las temperaturas introducidas.
        Indique cuántas temperaturas se han almacenado.

*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // pedir cuantas temperaturas van a metr
        System.out.println("Cuantas temperaturas quieres registrar: ");
        int cantidad = teclado.nextInt();
        
        // Declarar array con numeros decimales
         double[] temperaturas = new double[cantidad];
        
        // Solicitar a usuario las temperaturas
        for (int i = 0; i < temperaturas.length; i++){
            System.out.println("Introduce la temperatura "  + (i + 1) + ":");
            temperaturas [i] = teclado.nextDouble();
        }
        
        // Mostar temperaturas introducidas
        System.out.println("Temperaturas registradas: ");
        
        for (int i = 0; i < temperaturas.length; i++){
        System.out.println(temperaturas[i] + " °C");
        }
        // Indicar cuántas temperturas se han almacenado
        System.out.println("Las temperaturas registradas son: " + cantidad);
    }
    
}
