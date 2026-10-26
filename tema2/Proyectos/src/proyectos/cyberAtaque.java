
package proyectos;

/**
 *
 * @author Aya, Daniel y Maitane
 */


import java.util.Scanner;
public class cyberAtaque {
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        // Indica que el juego esta activo.
        boolean jugando = true;
        // Indica que al principio no tienes llave.
        boolean llave = false;
        // Muestra el menu repetidamente mientras el juego este activo.
        while (jugando) {
            // Muestra la opcion 1 del menu.
            System.out.println("\n1. Explorar sala");
            // Muestra la opcion 2 del menu.
            System.out.println("2. Inventario");
            // Muestra la opcion 3 del menu.
            System.out.println("3. Hackear puerta");
            // Muestra la opcion 0 para salir.
            System.out.println("0. Salir");
            // Pide al usuario que elija una opcion.
            System.out.print("Elige una opcion: ");
            // Guarda el numero que ha introducido el usuario.
            int opcion = teclado.nextInt();
            // Comprueba que opcion ha elegido el usuario.
            switch (opcion) {
                // Si el usuario elige la opcion 1, explora la sala.
                case 1:
                    // Comprueba si el usuario no tiene llave.
                    if (llave == false) {
         // Cambia el valor de llave a verdadero.
         llave = true;
         // Informa de que ha encontrado una llave.
                    System.out.println("Has encontrado una llave.");

                    // Si ya tiene la llave, ejecuta estas instrucciones.
                    } else {
                        // Informa de que ya tiene la llave.
                        System.out.println("Ya tienes la llave.");
                    }
                    // Termina el caso 1 del switch.
                    break;
                // Si el usuario elige la opcion 2, consulta el inventario.
                case 2:
                    // Comprueba si el usuario tiene una llave.
                    if (llave == true) {
                        // Muestra que tiene una llave.
                        System.out.println("Tienes una llave.");
                    // Si no tiene la llave, ejecuta estas instrucciones.
                    } else {
                        // Informa de que el inventario esta vacio.
                        System.out.println("No tienes llave.");
                    }
                    // Termina el caso 2 del switch.
                    break;
                // Si el usuario elige la opcion 3, intenta abrir la puerta.
                case 3:
                    // Comprueba si el usuario tiene la llave.
                    if (llave == true) {
                        // Informa de que comienza la apertura de la puerta.
                        System.out.println("Abriendo puerta...");
                        // Inicia el progreso en 10.
                        // Continua mientras el progreso sea menor o igual a 100.
                        // Suma 10 al progreso en cada repeticion.
                        for (int progreso = 10; progreso <= 100; progreso += 10) {
                            // Muestra el porcentaje actual del progreso.
                            System.out.println(progreso + "%");
                            // Comprueba si el progreso ha llegado a 100.
                            if (progreso == 100) {
                                // Informa de que el jugador ha ganado.
                                System.out.println("¡Has ganado!");
                                // Cambia jugando a false para terminar el juego.
                                jugando = false;
                                // Sale del bucle for porque el hackeo ha terminado.
                                break;
                            }
                        }
                    // Si el usuario no tiene llave, ejecuta estas instrucciones.
                    } else {
                        // Informa de que necesita una llave.
                        System.out.println("Necesitas una llave.");
                    }
                    // Termina el caso 3 del switch.
                    break;
                // Si el usuario elige la opcion 0, sale del juego.
                case 0:
                    // Cambia jugando a false para terminar el while.
                    jugando = false;
                    // Termina el caso 0 del switch.
                    break;
                // Si elige una opcion diferente de 0, 1, 2 o 3.
                default:
                    // Muestra un mensaje de opcion incorrecta.
                    System.out.println("Opcion incorrecta.");
                    // Vuelve al inicio del while para mostrar el menu.
                    continue;
            }
        }
        // Muestra el mensaje final.
        System.out.println("Fin del juego.");
    }
}
