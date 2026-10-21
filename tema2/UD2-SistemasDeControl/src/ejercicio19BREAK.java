/*
El Guardián del Sistema:
Pide un PIN de acceso e indica con if/else si es correcto o incorrecto.
Usa un bucle while para dar al usuario un máximo de 3 oportunidades.
Añade un menú a tu elección con switch cuando acierte.

siguiente dia sin el break y con el do-while
 */

/**
 *
  Maitane
 */


import java.util.Scanner;

public class ejercicio19BREAK {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // PIN correcto
        final int pinCorrecto = 2580;
        // Iniciamos en 0
        int contador = 0;
        
        while (contador <= 3 || pinCorrecto != 2580)
        {
            System.out.println("Introduce el PIN: ");
            int numero = teclado.nextInt();
            
            if (numero == pinCorrecto){
                System.out.println("El PIN es correcto: ");
                System.out.println("Has necesitado " + contador + " intentos.");
                break;
            }else {
                System.out.println("Has introducido el PIN erroneamene ");
                        }
            contador++;
            }
        }
    }

