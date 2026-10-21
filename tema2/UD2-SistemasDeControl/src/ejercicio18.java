/*
Desarrolla un programa Java que simule el acceso a un sistema mediante un PIN de cuatro cifras.
El PIN correcto es 2580. El usuario dispone de un máximo de tres intentos.
El programa debe cumplir las siguientes condiciones:
    Solicita un PIN al usuario.
    Mientras el PIN sea incorrecto y queden intentos disponibles, vuelve a solicitarlo.
    Si el usuario introduce el PIN correcto, muestra Acceso concedido.
    Si agota los tres intentos sin acertar, muestra Acceso bloqueado.
    Después de cada PIN incorrecto, muestra los intentos que le quedan.
    Utiliza un bucle while con la condición al principio. No utilices for ni do-while.
Ejemplo de ejecución 1
    Introduce el PIN: 1234
    PIN incorrecto. Te quedan 2 intentos.
    Introduce el PIN: 1111
    PIN incorrecto. Te quedan 1 intentos.
    Introduce el PIN: 2580
    Acceso concedido.
Ejemplo de ejecución 2
    Introduce el PIN: 1234
    PIN incorrecto. Te quedan 2 intentos.
    Introduce el PIN: 1111
    PIN incorrecto. Te quedan 1 intentos.
    Introduce el PIN: 9999
    PIN incorrecto. Te quedan 0 intentos.
    Acceso bloqueado.
    Pistas para resolverlo (intentar no mirarlas al principio)
    Utiliza una variable pinCorrecto, otra pinIntroducido y otra intentos.
Inicializa intentos a 3.
La condición del while debe comprobar dos cosas: que el PIN sea incorrecto y que queden intentos.
Recuerda actualizar las variables dentro del bucle para evitar que se repita indefinidamente.
Ampliación
Modifica el programa para que, cuando el usuario acierte el PIN, también muestre cuántos intentos ha necesitado.

 */

/**
 *
 * Maitane
 */


import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Guarda el PIN correcto, que es 2580.
        int pinCorrecto = 2580;

        // Inicializa el PIN introducido a 0 para poder entrar en el while.
        int pinIntroducido = 0;

        // Establece que el usuario dispone de 3 intentos.
        int intentos = 3;

        // Cuenta cuántos intentos ha utilizado el usuario.
        int intentosUsados = 0;

        // Repite mientras el PIN sea incorrecto y queden intentos disponibles.
        while (pinIntroducido != pinCorrecto && intentos > 0) {

            // Solicita al usuario que introduzca el PIN.
            System.out.print("Introduce el PIN: ");

            // Lee el PIN introducido por el usuario.
            pinIntroducido = teclado.nextInt();

            // Suma uno al contador de intentos utilizados.
            intentosUsados++;

            // Comprueba si el PIN introducido es incorrecto.
            if (pinIntroducido != pinCorrecto) {

                // Resta un intento porque el PIN es incorrecto.
                intentos--;

                // Muestra un mensaje con los intentos que quedan.
                System.out.println("PIN incorrecto. Te quedan "
                        + intentos + " intentos.");

            // Termina el bloque que comprueba si el PIN es incorrecto.
            }

        // Termina el bucle while.
        }

        // Comprueba si el usuario ha introducido el PIN correcto.
        if (pinIntroducido == pinCorrecto) {

            // Muestra el mensaje de acceso concedido.
            System.out.println("Acceso concedido.");

            // Muestra el número de intentos que ha necesitado el usuario.
            System.out.println("Has necesitado "
                    + intentosUsados + " intentos.");

        // Si el PIN no es correcto, se ejecuta el bloque else.
        } else {

            // Informa de que el acceso está bloqueado.
            System.out.println("Acceso bloqueado.");

        // Termina el bloque if-else.
        }

        // Cierra el Scanner porque ya no se necesita.
        teclado.close();

    // Termina el método main.
    }

// Termina la clase Main.
}
