/*
diseñar un metodo que calcule el importe de una compra aplicando un descuento

nivel               requisitos
intermedio          recibir el precio y el procentaje de descuento

 */

/**
 *
 * @author Maitane Navarro
 */
import java.util.Scanner;
public class Ejercicio3b {

    // Recibe el precio y devuelve el importe con un descuento que quiera meter en %.
    // Double porque pueden ser decimales.
    public static double calcularImporte(double precio, double descuento) {
        return precio - (precio * descuento / 100);
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pido precio de la compra
        System.out.print("Introduce el precio de la compra: ");
        double precio = teclado.nextDouble();
        
        // Pido descuento de la compra
        System.out.print("Introduce el descuento: ");
        double descuento = teclado.nextDouble();
        
        // Llamamos al método para calcular el precio con descuento
        double importeFinal = calcularImporte(precio,descuento);

        // Mostramos el importe final por pantalla.
        System.out.println("Precio inicial: " + precio + " €");
        System.out.println("Importe final con descuento: " + importeFinal + " €");
    }


}
