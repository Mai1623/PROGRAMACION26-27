/**
 *
 * @author Maitane Navarro
 */
// Añade que si el usuario no es correcto, entonces muestre "usuario incorrecto"

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        final String usuarioCorrecto = "Maitane";
    // Si el usuario coincide muestr el mensaje, si no, no lo muestra
        System.out.print("Introduce tu nombre de usuario: ");
        String usuario = "Maitane";

        // si el usuario introducido coincide con usuario correcto
        // le damos la bienvenida, en otro caso, continuael programa
        if (usuario == usuarioCorrecto) {
            System.out.println("¡Bienvenido " + usuario + "!");
    } else {
        System.out.println("Usuario incorrecto");
        }
}
}
