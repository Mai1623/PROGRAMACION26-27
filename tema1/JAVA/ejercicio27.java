/* 
Crea un programa en JAva que calcule el precio final de una entrada de cine
en funcion de la edad del cliente.
el programa debe solicitar por teclado:
* el nombre del cliente
* su edad
el precio de la entrada normal: 8€

aplica las siguientes tarifas:
*** El programa debe mostrar:
cliente: X;
edad: X;
precio entrada: X€.

para calcular el precio debes utilizar el operador ternario ?:
    double precio = condicion ? valorSiVerdadero : valorSiFalso;
Primera Parte
    menor de 12 años: 5€
    entrada general: 8€

 */
import java.util.Scanner;

public class ejercicio27 {

    public static void main(String[] args) {
        //leer lo que escribimos
        Scanner teclado = new Scanner(System.in);
            
        //Introducir nombre por teclado
        System.out.println("Introduce tu nombre: ");
        String nombreCliente = teclado.nextLine();
        
        //Introducir edad por teclado
        System.out.println("Introduce tu edad: ");
        int edadCliente = teclado.nextInt();
        
        //Calculamos precio
        double precio = edadCliente <= 12 ? 5.0 : 8.0;

        // Mostramos los datos del cliente
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Edad: " + edadCliente);
        System.out.println("Precio entrada: " + precio);

        // Cerramos el Scanner
        teclado.close();
    }
}

