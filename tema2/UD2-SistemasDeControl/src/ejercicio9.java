/*
9. Calculadora básica:
Crear un programa que realice las cuatro operaciones básicas (suma,
resta, multiplicación y división) según la opción que seleccione el
usuario.
*/


import java.util.Scanner; 

public class ejercicio9 { 

    public static void main(String[] args) { 

        Scanner teclado = new Scanner(System.in); 

        // Pedimos el primer número
        System.out.println("Introduce el primer número:"); 
        double numero1 = teclado.nextDouble(); 

        // Pedimos el segundo número
        System.out.println("Introduce el segundo número:"); 
        double numero2 = teclado.nextDouble(); 

        // Mostramos el menú de operaciones.
        System.out.println("Selecciona una operación:"); 
        System.out.println("1. Suma"); 
        System.out.println("2. Resta"); 
        System.out.println("3. Multiplicación"); 
        System.out.println("4. División"); 

        
        // Leemos la opción elegida por el usuario
        int opcion = teclado.nextInt(); 

        // Comprobamos si el usuario ha elegido la suma
        if (opcion == 1) { 
            System.out.println("Resultado: " + (numero1 + numero2)); 

        // Comprobamos si ha elegido la resta
        } else if (opcion == 2) {
            System.out.println("Resultado: " + (numero1 - numero2));

        // Comprobamos si ha elegido la multiplicación
        } else if (opcion == 3) { 
            System.out.println("Resultado: " + (numero1 * numero2)); 

        // Comprobamos si ha elegido la división
        } else if (opcion == 4) { 

            // Comprobar que el divisor no sea cero
            if (numero2 != 0) { 
                System.out.println("Resultado: " + (numero1 / numero2)); 
            } else { 
                System.out.println("Error: no se puede dividir entre cero."); 
            } 

        } else { 
            System.out.println("Opción no válida."); 
        }

        teclado.close(); 
    } 
} 
