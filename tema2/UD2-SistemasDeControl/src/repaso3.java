/*
Escribe un programa en Java que muestre por pantalla los números del 1 al 5, uno en cada línea, utilizando obligatoriamente un bucle while.
Requisitos:
Crea una variable entera llamada numero e inicialízala a 1.
Utiliza while para repetir mientras numero sea menor o igual que 5.
Dentro del bucle, muestra el valor de numero.
Incrementa numero en una unidad en cada repetición.
Resultado esperado:
    1
    2
    3
    4
    5
Pista: el bucle debe comprobar si numero es menor o igual que 5 antes de ejecutar las instrucciones de su interior.
Pregunta de comprobación: ¿qué ocurriría si olvidaras incrementar numero dentro del bucle?

*/

/**
 *
 * @author Maitane
 */

import java.util.Scanner;
    
public class repaso3 {
    public static void main(String[] args) {

        int numero = 1;

        while (numero <= 5) {
            System.out.println(numero);
            numero++;
        }
    }
}
