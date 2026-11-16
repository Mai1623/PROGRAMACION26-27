
/*

Inicial-intermedio
Una estación meteorológica almacena las temperaturas registradas durante siete días.
Desarrolla un programa que:
    Solicite las siete temperaturas.
    Muestre todas las temperaturas.
    Calcule la temperatura media.
    Indique la temperatura máxima.
    Indique la temperatura mínima.
    Cuente cuántos días la temperatura superó los 25 grados.
    Condición: debes utilizar un array y recorrerlo para realizar los cálculos.

*/

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
    // Solicite las siete temperaturas.
    Scanner teclado = new Scanner(System.in);
    double [] temperaturas = new double [7];
    
    for (int i = 0; i < temperaturas.length; i++){
        System.out.println("Introduzca temperatura del dia " + i+1);
        temperaturas [i] = teclado.nextDouble();
    }
    // Muestre todas las temperaturas.
    for (int i = 0; i < temperaturas.length; i++){
        System.out.println("Dia: " + (i + 1) + "temperatura: " + temperaturas[i]);
    }
    double suma = 0;
    for (double temperatura : temperaturas){
        suma += temperatura;
    }
    // Calcule la temperatura media.
    double media = suma / temperaturas.length;
    System.out.println("La media es: " + media);
    
    // Indique la temperatura máxima.
        double max = temperaturas[0];
        for (double temp : temperaturas){
            if (temp > max){
                max=temp;
            }
        }
    // Indique la temperatura mínima.
        double min = temperaturas[0];
        for (double temp : temperaturas){    
            if (temp < min) {
                min = temp;
            }
        }
    // Cuente cuántos días la temperatura superó los 25 grados.
    int contador = 0;
        for (double temp : temperaturas){
             if (temp > 25){
                 contador++;
             }
        }
        System.out.println("Dias con mas de 25º: " + contador);
    // Condición: debes utilizar un array y recorrerlo para realizar los cálculos.
    }
}
