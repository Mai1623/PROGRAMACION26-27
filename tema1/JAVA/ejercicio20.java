// Crear una aplicación que calcule la media aritmética de dos
// notas enteras. Hay que tener en cuenta que la media puede
// contener decimales.

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        // introduce datos por teclado
        Scanner teclado = new Scanner(System.in);
        
        // muestra mensaje para meter nota 1
        System.out.print("Introduce la primera nota: ");
        int nota1 = teclado.nextInt();
        
        // muestra mensaje para  meter nota 2
        System.out.print("Introduce la segunda nota: ");
        int nota2 = teclado.nextInt();
        
        // calcula nota media
        double media = (nota1 + nota2) / 2.0;
        //double media = (int) (nota1 + nota 2) / 0.2
        
        // imprime nota media haciendo calculo
        System.out.println("La media es: " + media);
    }
}
