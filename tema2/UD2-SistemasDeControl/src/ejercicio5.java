/* Mayor o menor: solicitar al usuairo dos numeros y mostrar cual es mayor.
¿Como harias para evaluar ademas si son iguales?
*/

/**
 *
 * @author 06_1DAW
 */
import java.util.Scanner;

  

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n1 = teclado.nextInt();

        System.out.println("Introduce otro numero: ");
        // Esto es si uno es mayor que el otro
        int n2 = teclado.nextInt();
        if (n1 > n2) {
            System.out.println("El numero " + n1 + " es mayor que " + n2);

            // Comprobamos si el segundo número es mayor que el primero
        } else if (n2 > n1) {
            System.out.println("El numero " + n2 + " es mayor que " + n1);

            // Si ninguna de las condiciones anteriores se cumple, son iguales
        } else {
            System.out.println("Los dos números son iguales");
        }

        // Cerramos el Scanner
        teclado.close();
    }

