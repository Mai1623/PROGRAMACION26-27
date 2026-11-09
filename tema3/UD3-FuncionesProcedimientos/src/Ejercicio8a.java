/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maitane Navarro
 */

public class Ejercicio8a {

    // Metodo para generar un numero aleatorio entre 1 y 10
    public static int generarAleatorio() {

        // Generamos un numero aleatorio entre 1 y 10
        return (int) (Math.random() * 10) + 1;
    }

    // Metodo principal del programa
    public static void main(String[] args) {

        // Creamos un bucle que se repite 10 veces
        for (int i = 1; i <= 10; i++) {

            // Llamamos al metodo y mostramos el numero aleatorio
            System.out.println("Numero aleatorio " + i + ": " + generarAleatorio());
        }
    }
}

