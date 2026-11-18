/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maitane Navarro
 */
public class EjemploMatrices {
    public static void main(String[] args) {
        
        
        double [][] notas = {
            {7.5, 8.0},
            {4.0, 6.5},
            {9.0, 8.5},
        };
     
        for (int i = 0; i < notas.length; i++){
            for (int j = 0; j < notas[i].length; j++){
                System.out.println(notas[i][j]);
            }
        }
    }
}
