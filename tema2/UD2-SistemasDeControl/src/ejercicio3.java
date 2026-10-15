
/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String usuarioCorrecto = "Maitane";

        System.out.print("Introduce tu nombre de usuario: ");
        String usuario = teclado.nextLine();

        if (usuario.equals(usuarioCorrecto)) {
            System.out.println("¡Bienvenido " + usuario);
        }

        teclado.close();
    }
}