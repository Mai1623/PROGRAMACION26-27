/*

    Crea un método que te diga si un número es par o no.

    Luego usa ese método en el main para imprimir los números pares entre 1 y 10

 */

/**
 *
 * @author Maitane Navarro
 */

public class NotaGeneral {
    public static boolean esPar(int numero) {

        // comprobar si el resto de dividir es 0 y si es cierto, devuelve true
        if (numero % 2 == 0) {
            return true;

        } else {
            // si no lo cumple, falso
            return false;
        }
    }
    public static void main(String[] args) {

        // recorrer los numeros del 1 al 10
        for (int i = 1; i <= 10; i++) {

            // comprobar si el numero actual es par
            boolean numeroEsPar = esPar(i);

            // Si el numero es par, lo imprime
            if (numeroEsPar) {

                System.out.println(i);
            }
        }
    }
}
