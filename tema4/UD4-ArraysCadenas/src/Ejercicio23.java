/*
Construir un nombre completo
Solicita al usuario:
    Nombre.
    Primer apellido.
    Segundo apellido.
Construye y muestra el nombre completo.
Después, muestra el número total de caracteres.
*/

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Introducice un nombre
        System.out.println("Introduce un nombre: ");
        String nombre = teclado.nextLine();
            
        // Introduce un apellido
        System.out.println("Introduce un apellido: ");
        String ape1 = teclado.nextLine();
        
        // Introduce otro apellido
        System.out.println("Introduce otro apellido: ");
        String ape2 = teclado.nextLine();
        
        // Mostrar nombre, apellido1 y apellido2
        System.out.println(nombre + " " + ape1 + " " + ape2);
        
        // Saber longitud palabra con contadores para coger las anteriores variables
        String palabra1 = nombre;
        String palabra2 = ape1;
        String palabra3 = ape2;

            int total = palabra1.length() + palabra2.length() + palabra3.length();
            System.out.println("Total de caracteres: " + total);
        
        
    }
}
