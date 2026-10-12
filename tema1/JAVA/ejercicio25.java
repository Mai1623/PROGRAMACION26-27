/*
Un frutero necesita calcular los beneficios anuales que obtiene de la venta de
manzanas y peras. Por este motivo, es necesario diseñar una aplicacion que
solicite las ventas (en kilos) de cada semestre para cada fruta. La aplicacion
mostrara el importe total sabiendo que el precio del kilo de manzanas esta
fijado en 2,35€ y el kilo de peras en 1,95€.
 */

import java.util.Scanner;

    public class ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Precios por kilo //double  o float para coger decimales
        double precioManzanas = 2.35;
        double precioPeras = 1.95;
        
        // Introducir kilos de manzanas 1er semestre
        System.out.println("Introduce los kilos de manzanas del primer semestre: ");
        double manzanas1 = teclado.nextDouble();
        
        // Introducir kilos de manzanas del 2o semestre
        System.out.println("Introduce los kilos de manzadas del segundo semestre: ");
        double manzanas2 = teclado.nextDouble();
        
        // Introducir kilos de peras 1er semestre
        System.out.println("Introduce los kilos de peras del primer semestre: ");
        double peras1 = teclado.nextDouble();
        
        // Introducir kilos de peras del 2o semestre
        System.out.println("Introduce los kilos de manzanas del segundo semestre: ");
        double peras2 = teclado.nextDouble();
       
        // Calculamos los kilos de manzanas y manzanas
        double totalManzanas = (manzanas1 + manzanas2);
        double totalPeras = (peras1 + peras2);
        
        // Calculamos el dinero obtenido por cada fruta
        double importeManzanas = totalManzanas * precioManzanas;
        double importePeras = totalPeras * precioPeras;
        
        // Calculamos el importe total
        double importeTotal = importeManzanas + importePeras;

        // Mostramos los resultados
        System.out.println("Total de manzanas: " + totalManzanas + " kg");
        System.out.println("Total de peras: " + totalPeras + " kg");
        System.out.println("Importe de manzanas: " + importeManzanas + " €");
        System.out.println("Importe de peras: " + importePeras + " €");
        System.out.println("Importe total anual: " + importeTotal + " €");

    }
}