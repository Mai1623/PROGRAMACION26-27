/* Login: Escribe un programa que pida el nombre de usuario y si es correcto
muestre “¡Bienvenido <usuario>!”. En otro caso no debe hacer nada.
Un usuario será correcto si coincide con el valor establecido literalmente
por el programador en
el código. */

/**
 *
 * @author 06_1DAW
 */
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        final String usuarioCorrecto = "Maitane";
    // Si el usuario coincide muestr el mensaje, si no, no lo muestra
        System.out.print("Introduce tu nombre de usuario: ");
        String usuario = "Maitane";

        if (usuario == usuarioCorrecto) {
            System.out.println("¡Bienvenido " + usuario + "!");
        }

    }
}