/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maitane Navarro
 */

public class EjemploArray {
           public static void main(String[] args){
           // declaracion
           double[] temperaturas = {18.5, 21.0, 24.5, 19.0, 27.5}; //TODO en dos lineas
           System.out.println("Temperaturas: " + temperaturas);
           
           for (int i = 0; i <= temperaturas.length -1; i++){
               System.out.println("Dia " + (i + 1) + " - " + temperaturas[i]);
           }
           temperaturas[1] = 22.0;
           System.out.println(temperaturas[1]);
           
        }
}
