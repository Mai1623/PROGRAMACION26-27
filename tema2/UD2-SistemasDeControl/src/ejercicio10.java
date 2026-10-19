/* 10. Triángulo: Dado tres lados, determinar si pueden formar un triángulo y, en caso
afirmativo, indicar si es equilátero, isósceles o escaleno.
Tres lados forman un triángulo si la suma de las longitudes de dos cualesquiera es mayor que la
longitud del tercero 
Equilátero: todos los lados iguales
Isósceles: dos lados iguales
Escaleno: ningún lado igual*/

import java.util.Scanner; 

public class ejercicio10 {

    public static void main(String[] args) { 

        Scanner teclado = new Scanner(System.in); 

        // Pedimos el primer lado y lo leemos
        System.out.println("Introduce el primer lado:"); 
        double lado1 = teclado.nextDouble(); 

        // Pedimos el segundo lado y lo leemos
        System.out.println("Introduce el segundo lado:"); 
        double lado2 = teclado.nextDouble(); 
        
        // Pedimos el tercer lado y lo leemos
        System.out.println("Introduce el tercer lado:"); 
        double lado3 = teclado.nextDouble(); 

        // Comprobar que todos los lados sean positivos.
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) { 
            System.out.println("Los lados deben ser mayores que cero.");  // Mostramos el error.

        } else if (lado1 + lado2 > lado3 && 
                   lado1 + lado3 > lado2 && 
                   lado2 + lado3 > lado1) { 

            if (lado1 == lado2 && lado2 == lado3) { // Comprobamos si los tres lados son iguales.
                System.out.println("El triángulo es equilátero."); // Si lo son, es equilátero.

            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) { // Comprobamos si dos lados son iguales.
                System.out.println("El triángulo es isósceles."); // Si dos lados son iguales, es isósceles.

            } else { // Si no hay lados iguales.
                System.out.println("El triángulo es escaleno."); // Los tres lados son diferentes.
            } // Cerramos la clasificación del triángulo.

        } else { // Si no se cumplen las tres desigualdades.
            System.out.println("Los lados no pueden formar un triángulo."); // Indicamos que no es posible.
        } // Cerramos la comprobación principal.

        teclado.close(); // Cerramos el Scanner.
    } // Cerramos el método main.
} // Cerramos la clase Triangulo.