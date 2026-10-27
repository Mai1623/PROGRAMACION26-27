/*
Ejercicio 1: El Escáner de Seguridad (Dificultad: Baja)
(Vinculado a CE a, CE e, CE g)
En una estación espacial, el terminal de control clasifica a las naves según su código de autorización numérico (un número entero del 1 al 4):
    1: Nave Aliada  Imprime: "Acceso concedido: Sector Central".
    2: Nave Comercial  Imprime: "Acceso concedido: Hangar de Carga".
    3: Nave Desconocida  Imprime: "Acceso restringido: Enviar escolta".
    4: Nave Hostil  Imprime: "¡ALERTA! Iniciar protocolos de defensa".
Cualquier otro número  Imprime: "Código no válido".
Se pide:
    Escribe un programa en Java que solicite al usuario el código numérico y procese la respuesta utilizando la estructura switch.
    Si la nave es Comercial (código 2), añade una condición adicional (if / else) que pida el tonelaje de carga (número entero). Si supera los 500 toneladas, debe mostrar el mensaje adicional: "Requiere inspección aduanera".
    Comenta brevemente la función de cada bloque principal.

*/

/**
 *
 * @author Maitane Navarro
 */

package examen;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Pedimos el código de la nave.
        System.out.print("Introduce el código de autorización (1-4): ");
        // Leemos el código y lo guardamos en la variable codigo
        int codigo = teclado.nextInt();

        // Aqui guarda la opcion que haya seleccionado anteriormente entre el 1-4
        switch (codigo) {
        // Si el código es 1, se trata de una nave aliada.
            case 1: 
                System.out.println("Acceso concedido: Sector Central"); 
                break;
        // Si el código es 2, se trata de una nave comercial
            case 2: 
                System.out.println("Acceso concedido: Hangar de Carga"); 
        // Pedir el peso de la carga en toneladas
                System.out.print("Introduce el tonelaje de carga: "); 
                int tonelaje = teclado.nextInt();
 
            // Comprobamos si el tonelaje supera las 500 toneladas
                if (tonelaje > 500) {
                     // Si supera 500, mostramos este aviso
                    System.out.println("Requiere inspección en la aduana");
                } else { // Si no muestra este.
                    System.out.println("No requiere inspección en la aduana"); 
                }
                break;
            // Si el código es 3, se trata de una nave desconocida
                case 3:
                    System.out.println("Acceso restringido: Viene la policia.");
                break;
            // Si el código es 4, hay que iniciar protocolos de defensa     
                case 4:
                    System.out.println("¡ALERTA! Iniciar protocolos de defensa");
                break;
            // Si el código esta fuera del 1-4 muestra "codigo no valido"
                default:
                    System.out.println("Código no válido");
            }
    }
    
}
