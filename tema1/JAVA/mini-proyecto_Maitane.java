import java.util.Scanner;

public class ConversorMoneda {
    public static void main(String[] args) {

        // Crear el objeto para leer datos
        Scanner teclado = new Scanner(System.in);

        // Declarar una constante
        final double CAMBIO = 1.10;

        // Pedir la cantidad de euros
        System.out.print("Introduce la cantidad en euros: ");
        double euros = teclado.nextDouble();

        // Convertir euros a dólares
        double dolares = euros * CAMBIO;

        // Mostrar el resultado
        System.out.println("Euros: " + euros);
        System.out.println("Dolares: " + dolares);

        // Cerrar el lector
        teclado.close();
    }
}

