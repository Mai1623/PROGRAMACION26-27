
/**
 *
 * @author 06_1DAW
 */
// Par o impar: Pedir un numero al usuario y determinar si es par o impar.
/*
1.- se pide el numero pr teclado
2.- se comprueba si es par diviendolo entre 2 y da 0 %
3.- una vez comparado se muestra si es par o impar
4.- se cierra el teclado
*/ 

import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        // Pedimos un número al usuario
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt(); // Guardamos el número introducido

        // Comprobamos si el resto de dividir el número entre 2 es cero
        if (numero % 2 == 0) {
            System.out.println("El número es par");

        // Si el resto no es cero, el número es impar
        } else {
            System.out.println("El número es impar");
        }
        
        // Cerramos el Scanner
        teclado.close();
    }
}

