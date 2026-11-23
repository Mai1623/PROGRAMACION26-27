/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mai_n
 */
public class DemostracionString {
    public static void main(String[] args){
        String texto = "Programacion Java";
        // Longitud
        System.out.println("Longitud: "+texto.length());
        // Primer carácter
        System.out.println("Primero: "+texto.charAt(0));
        // Último carácter
        System.out.println("Último: " + texto.charAt(texto.length()-1));
        // Concatenación
        String mensaje="Estamos prendiendo"+texto;
        System.out.println(mensaje);
        // Comparación
        String lenguaje="JAVA";
        System.out.println(lenguaje.equals("Java"));
        System.out.println(lenguaje.equalsIgnoreCase("Java")
        );
        // Inmutabilidad
        String original = "hola";
        String mayusculas = original.toUpperCase();
        System.out.println(original);
        System.out.println(mayusculas);
    }
}
