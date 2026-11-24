package EjerciciosAmpliados;

/*
Extractor de texto
Solicita una frase y dos posiciones: inicio y fin.
Muestra la subcadena comprendida entre ambas posiciones.
Antes de utilizar substring(), comprueba que:
    El inicio no sea negativo.
    El final no supere la longitud.
    El inicio sea menor o igual que el final.
Ampliación: extraer la primera palabra de una frase utilizando indexOf(" ") y substring().
 */
/**
 *
 * @author mai_n
 */
import java.util.Scanner;

public class Ejercicio28Ampliado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // pedir una frase
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        // pedir las posiciones
        System.out.println("Introduce la posición de inicio: ");
        int inicio = teclado.nextInt();

        System.out.println("Introduce la posición de fin: ");
        int fin = teclado.nextInt();

        // comprobar las posiciones
        if (inicio >= 0 && fin <= frase.length() && inicio <= fin) {

            // extraer la subcadena
            String resultado = frase.substring(inicio, fin);
            System.out.println("La subcadena es: " + resultado);
        } else {
            System.out.println("Las posiciones introducidas no son valen");
        }
    }
}
