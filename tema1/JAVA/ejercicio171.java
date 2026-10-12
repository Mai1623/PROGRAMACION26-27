//NIVEL 2 (SimuladorCrono.java) dado un total de segundos (ej. 6427), utilizar
    //    operadores aritmeticos y de momdulo (/ y %) para descomponerlo y mostrar en
//pantalla cuantas horas, minutos y segundos exactos representa.
import java.util.Scanner;
    public class ejercicio171 {

        public static void main(String[] args) {
               // numero entero
            int totalSegundos = 6427;
                
            // calcular las horas porque una hora tiene 3600 segundos
            int horas = totalSegundos / 3600;
            
            // calculamos los minutos 1 hora, tiene 60 min 
            int minutos = (totalSegundos % 3600) / 60;
            
            // calculamos los segundos restantes que quedan con % para
            //que nos de el resto de una division
            int segundos = totalSegundos % 60;

            // imprime las horas    
            System.out.println("Horas: " + horas);
            
            // imprime los minutos 
            System.out.println("Minutos: " + minutos);
            
            // imprime los segundos 
            System.out.println("Segundos: " + segundos);
        }
    }