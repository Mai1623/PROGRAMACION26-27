/**
Mis cinco números
    Crea un programa que:
    Declare un array de cinco números enteros.
    Inicialice el array con cinco valores.
    Muestre todos los elementos.
    Modifique el tercer elemento.
    Vuelva a mostrar el array.
*/

/**
 *
 * @author Maitane Navarro
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // Declarar un array para almacenar 5 numeros
        int[] numeros = new int[5];
        
        // Iniciar el array con 5 valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
                                
        // Mostrar el mensaje para ver el array inicial 
        System.out.println("El valor del array inicial: ");
        
        // Recorrer el array con un for
        for (int i = 0; i < numeros.length; i++){
               System.out.println(numeros[i]);
           }
        
        // Modificar el tercer elemento
        numeros[2] = 60;
 
        // Mostrar un mensaje para indicar que el array ha sido modificado
        System.out.println("Array modificado: ");
        
        // Recorrer el array con un for de nuevo para ver el array modificado
        for (int i = 0; i < numeros.length; i++){
               System.out.println(numeros[i]);
           }
    }
    
}
