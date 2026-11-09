/*
Generación de numeros aleatorios
"Math.random() devuelve un numero decimal comprendido entre 0.0 (incluido) y 1.0 (excluido).

Ejercicio 8 
Realiza una funcion que genere un numero aleatorio entre 1 y 10.

*/

/**
 *
 * @author Maitane Navarro
 */


public class Ejercicio8 {

    // Metodo para generar un numero aleatorio entre 1 y 10
    public static int generarAleatorio() {

        // Generamos un numero aleatorio entre 0.0 y 1.0
        // Lo multiplicamos por 10 y sumamos 1
        // Convertimos el resultado a entero
        return (int) (Math.random() * 10) + 1;
    }

    // Metodo principal del programa
    public static void main(String[] args) {

        // Llamamos al metodo y guardamos el numero generado
        int numero = generarAleatorio();

        // Mostramos el numero aleatorio por pantalla
        System.out.println("Numero aleatorio 1: " + numero);        
        
    }
}
