


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;
public class EjemploString {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // nombre
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Maitane".equals(nombre));
        System.out.println(nombre == "Maitane");
        
        
        //cuidad
        System.out.println("Introduce tu cuidad: ");
        String cuidad = teclado.nextLine();
        
        //edad
        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();
        
        
        //imprimir
        System.out.println("----------- ficha de usuario ----------");
        System.out.println("nombre " + nombre);
        System.out.println("cuidad " + cuidad);
        System.out.println("edad " + edad);
        System.out.println("caracteres del nombre " + nombre.length());
    }
    
}
