
import java.time.Clock;



/**
 *
 * @author Maitane
 */


public class ejemploDoWhile {
    public static void main(String[] args) {
        
        int numero = 1; //Empezamos en 1
        do {
            System.out.println("Numero: " + numero);
        numero++;
        } while (numero <= 3);
        System.out.println("Fin del programa");
    }
}