/*
Parte A: Programación (3 puntos)
Diseña un programa en Java que simule el proceso de recarga de batería de un robot explorador.
    • El robot empieza con una batería inicial del 10%.
    • En cada ciclo (bucle), el robot realiza una carga interactiva donde se le pregunta al usuario cuántos puntos de energía desea inyectar (un entero entre 1 y 30).
    • Si el usuario introduce un valor fuera de rango (menor que 1 o mayor que 30), el sistema debe mostrar "Entrada inválida" y pedir el valor de nuevo sin sumar nada a la batería.
    • La recarga finaliza cuando la batería alcanza o supera el 100%.
    • Al finalizar el bucle, debe mostrar el número total de ciclos de recarga que han sido necesarios.

*/
package examen;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Inicializamos la batería del robot a 10
        int bateria = 10;
        // Inicializamos el contador de ciclos de recarga a cero porque no hemos hecho ningun ciclo
        int ciclos = 0;
        
        // Repetir el proceso hasta que la bateria llegue a 100
        while (bateria <= 100){
            // Mostrar porcentaje bateria
            System.out.println("Bateria: " + bateria);
            // variable para que almacene la  bateria 
            int energia;
            
            // introducir ejergia y leerlo por teclado
            System.out.print("¿Cuanta energía quieres inyectar (1-30)? ");
            energia = teclado.nextInt();
            
            // comprobar si esta entre 1 y 30.
            while (energia < 1 || energia > 30) {
                // si no es valida mostrar mensaje 
                System.out.println("Entrada inválida");
                // dependiendo de que haya metido lo muestra otra vez
                System.out.print("Introduce un valor entre 1 y 30: ");
                energia = teclado.nextInt();
            }
            // sumar la bateria que teniamos con la energia que ha metido
            bateria = bateria + energia;
            // aumentar los ciclos uno a uno 
            ciclos++;
        }
        // porcentaje final de la bateria
        System.out.println("Batería final: " + bateria + "%");
        // numero total de ciclos que se han necesitado
        System.out.println("Número de ciclos de recarga: " + ciclos);

    }
}