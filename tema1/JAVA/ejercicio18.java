// Escribir una aplicación que pida el año actual y el de nacimiento
// del usuario. Debe calcular su edad, suponiendo que en el año en
// curso el usuario ya ha cumplido años.

import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {
        // Introducir datos por  teclado
        Scanner teclado = new Scanner(System.in);
        
        //imprime por pantalla 
        System.out.print("Introduce el año actual: ");
        //leemos el numero entero
        int añoActual = teclado.nextInt();

        //imprime mensaje por pantalla
        System.out.print("Introduce tu año de nacimiento: ");
        
        //leemos el numero entero
        int añoNacimiento = teclado.nextInt();

        // calcular la edad actual
        int edad = añoActual - añoNacimiento;

        //muestra la edad 
        System.out.println("Tu edad es: " + edad + " años");
    }
}

