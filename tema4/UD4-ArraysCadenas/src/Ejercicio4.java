/*
Invertir posiciones
Ampliación
    Crea un array de seis números enteros.
    Intercambia el primer elemento con el último, el segundo con el penúltimo y el tercero con el cuarto.
    Muestra el array antes y después de realizar los intercambios.

*/

/**
 *
 * @author Maitane Navarro
 */



public class Ejercicio4 {

    public static void mostrar(int[] numeros) {
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6};
        int cambio;

        System.out.println("Antes:");
        mostrar(numeros);

        cambio = numeros[0];
        numeros[0] = numeros[5];
        numeros[5] = cambio;

        cambio = numeros[1];
        numeros[1] = numeros[4];
        numeros[4] = cambio;

        cambio = numeros[2];
        numeros[2] = numeros[3];
        numeros[3] = cambio;

        System.out.println("Después:");
        mostrar(numeros);
    }
}


