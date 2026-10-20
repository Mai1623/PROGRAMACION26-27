/*
contar hasta un numero usando "para"
 */

/**
 *
 * @author Maitane
 */

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número límite: ");
        int numeroLimite = scanner.nextInt();
        
        // Estructura for para contar hasta el número
        for (int i = 1; i <= numeroLimite; i++) {
            System.out.println("Número: " + i);
        }
        
        scanner.close();
    }
}
