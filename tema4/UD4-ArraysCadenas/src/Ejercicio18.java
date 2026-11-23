/*
Métodos que modifican arrays
Crea una clase ModificadorArray con estos métodos:
    incrementar(int[] numeros): suma uno a todos los elementos.
    multiplicar(int[] numeros, int factor): multiplica cada elemento por el factor recibido.
    rellenarCeros(int[] numeros): establece todos los elementos a cero.
    Comprueba desde main que los cambios realizados por los métodos se reflejan en el array original.
*/

/**
 *
 * @author Maitane Navarro
 */


public class Ejercicio18 {

    // Método 1: Incrementar todos los elementos en 1
    public static void incrementar(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] + 1;
        }
    }

    // Método 2: Multiplicar todos los elementos por un factor
    public static void multiplicar(int[] numeros, int factor) {

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * factor;
        }
    }

    // Método 3: Rellenar todos los elementos con ceros
    public static void rellenarCeros(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 0;
        }
    }

    // Método principal
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Array original:");
        mostrarArray(numeros);

        incrementar(numeros);

        System.out.println("Después de incrementar:");
        mostrarArray(numeros);

        multiplicar(numeros, 2);

        System.out.println("Después de multiplicar por 2:");
        mostrarArray(numeros);

        rellenarCeros(numeros);

        System.out.println("Después de rellenar con ceros:");
        mostrarArray(numeros);
    }

    // Método auxiliar para mostrar el array
    public static void mostrarArray(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
    }
}
