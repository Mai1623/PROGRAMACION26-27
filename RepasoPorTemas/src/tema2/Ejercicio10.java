/*

Combinando todo — Método para verificar números primos
Objetivo: Crear un método que determine si un número entero es primo integrando un bucle for y condiciones if-else, y luego llamarlo dentro de un bucle en el main.
Guía paso a paso:
    Crea el método public static boolean esPrimo(int numero).
    Como los números menores o iguales a 1 no son primos, descártalos con una condición if (numero <= 1) return false;.
    Usa un bucle for para probar divisores desde 2 hasta la raíz del número (Math.sqrt(numero)).
    Dentro del bucle, evalúa si numero % i == 0. Si se encuentra cualquier divisor exacto, el número no es primo y debes retornar false inmediatamente.
    Si el bucle termina sin encontrar divisores, retorna true.
    En el main, recorre con un bucle una serie de números y usa el método dentro de un if para mostrar los resultados.


*/
package tema2;

/**
 *
 * @author Maitane Navarro
 */
public class Ejercicio10 {
    
}
