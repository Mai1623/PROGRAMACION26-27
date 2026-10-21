/*
El Guardián del Sistema:
Pide un PIN de acceso e indica con if/else si es correcto o incorrecto.
Usa un bucle while para dar al usuario un máximo de 3 oportunidades.
Añade un menú a tu elección con switch cuando acierte.
 */

/**
 *
  Maitane
 */


import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // PIN correcto
        int pinCorrecto = 2580;
        // Iniciamos en 0
        int pin = 0;
        // 3 Intentos
        int pinIntentos = 3;

        // Comprobación del pin
        while (pin != pinCorrecto && pinIntentos > 0) {
            System.out.print("Introduce el PIN: ");
            pin = teclado.nextInt();
            
            // Muestra los intentos que nos quedan
            if (pin != pinCorrecto) {
                // Va disminuyendo intentos
                pinIntentos--;
                System.out.println("Quedan " + pinIntentos + " intentos.");
                
            }
        }
            // Si el PIN es correcto muestra dos opciones
            if (pin == pinCorrecto) {
                System.out.println("Acceso concedido.");
                System.out.println("1. Hola  2. Salir");
                    int opcion = teclado.nextInt();
                        // Si selecciona la opción 1
                        if (opcion == 1)
                            System.out.println("Kaixooo!!");
                        // Si selecciona la opción 2
                        else if (opcion == 2)
                            System.out.println("Aguuuuur!!");
                        } else {
                        // Si se introduce el PIN mal 3 veces
                        System.out.println("Acceso bloqueado.");
                        }
    }
}