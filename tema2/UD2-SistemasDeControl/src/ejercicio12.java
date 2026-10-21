/*
ejercicio 12: Contar hasta un numero:
escribe un programa que pida al usuario un numero entero positivo y cuenta
desde 1 hasta ese numero.
ejemplo: si introduzco 3, el programa muestra 1, 2 y 3.
 */

/**
 *
 * @author Maitane 
 */

import java.util.Scanner;

public class ejercicio12 {

    private static int num;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Pedir el número al usuario
        System.out.print("Introduce un número entero: ");
        int limite = teclado.nextInt();
        
        // Iniciar el contador
        int contador = 1;
        
        // Bucle while para imprimir en la misma línea
        while (contador <= limite) {
            System.out.print(contador + " , ");
            contador++; // Incrementar el contador
        }
        
        teclado.close();
    }
}
