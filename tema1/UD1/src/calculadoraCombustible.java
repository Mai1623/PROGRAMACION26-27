
/**
 *
 * @Maitane Navarro
 */

// Eres el/la responsable del software de vuelo de la agencia espacial.Debes
// programar un módulo en Java que calcule el combustible exacto necesario
// para el lanzamiento del cohete Artemis-X, aplique los márgenes de seguridad
// y convierta los importes finales a presupuestos enteros para el
// departamento de contabilidad.

import java.util.Scanner;

  public class calculadoraCombustible {
    public static void main(String[] args) {

        
// Declaración dos constantes
        double CONSUMO_POR_KM;
            CONSUMO_POR_KM = 14.75;
        int RESERVA_SEGURIDAD;
           RESERVA_SEGURIDAD = 500;
       
        //Introducir Distanciakm por teclado
        int distanciaKm = 1456;
        
        //Introducir PrecioLitro por teclado
   
        double precioLitro = 1.85;

        //ahora vamos a calcular los litros totales
        double litros_totales_exactos= (distanciaKm * CONSUMO_POR_KM) + RESERVA_SEGURIDAD;
        
        //ahora vamos a calcular el coste total
        int Coste_total_exacto = (int)((litros_totales_exactos * precioLitro));
        
        // Trunca los decimales de los litros totales exactos a un 'int' para
        // obtener los 'litrosOficialesComprar'.
            
        //Trunca el coste total exacto a un 'int' para obtener el 'costePresupuestado'.
        
        // Mostramos los datos calculados
        System.out.println("El consumo por KM es: " + CONSUMO_POR_KM);
        System.out.println("La reserva de seguridad es: " + RESERVA_SEGURIDAD);
        System.out.println("La distancia por km es: " + distanciaKm);
        System.out.println("El precio por litro es de: " + precioLitro + "€/litro");
        System.out.println("El coste total exacto del lanzamiento es de: " + Coste_total_exacto);
        
        // Cerramos el Scanner

    }
}