// nivel 1 (CalculoDescuento.java) calcular el precio final de una armadura de juego
// de 120 creditos aplicando una constante DESCUENTO = 0.15 (15%).abstract 
       
    import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        // el valor no puede cambiar y guarda numemos con decimales
        final double DESCUENTO = 0.15;
        double precio = 120;

        double descuentoAplicado = precio * DESCUENTO;
        // calcular el precio final 
        double precioFinal = precio - descuentoAplicado;

        // imprime el precio original
        System.out.println("Precio original: " + precio + " créditos");
        // imprime el descuento 
        System.out.println("Descuento: " + descuentoAplicado + " créditos");
        // imprime el precio final
        System.out.println("Precio final: " + precioFinal + " créditos");
    }
}



 