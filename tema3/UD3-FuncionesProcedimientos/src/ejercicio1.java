/*
1.- localiza las instrucciones repetidas: identifica que bloques de codigo realiza exactamente
la misma tarea con distintas variables.

2.- describe con tus palabras que hacen esas instrucciones repetidas y por qué crees
que no es eficiente escribir el programa de esta manera.

    Las instrucciones repetidas lo que hacen es repetir el mismo codigo una y otra vez, pero en vez de tener
un solo codigo y cambiar los datos, se copian varias veces, por cada calculo que se  vaya hacer.

    Esto hace que el programa sea más largo y dificulta su mantenimiento.


3.- piensa un metodo que calcule el area de un rectangulo. ¿que recibiriia?
¿que devolveria?

    El metodo recibiría dos valores como parámetros: la base y la altura del rectángulo.
        Después, multiplicaría ambos valores para calcular el área y devolvería el resultado. 

4.- Refactorizar el programa completo para eliminar duplicaciones y mejorar la organización. Supón que el método es: 
public static int calcularAreaRectangulo(int base, int altura) { return base * altura; }
*/

/**
 *
 * @author Maitane Navarro
 */


public class ejercicio1 {

    // Declara un método público y estático que calcula el área de un rectángulo.
    // Recibe la base y la altura como números enteros.
    // Devuelve el resultado de multiplicar la base por la altura.
    public static int calcularAreaRectangulo(int base, int altura) {

        // Calcula el área del rectángulo y devuelve el resultado.
        return base * altura;
    }

    public static void main(String[] args) {

        // Declara la base del salón y le asigna el valor 5.
        int base1 = 5;
        // Declara la altura del salón y le asigna el valor 4.
        int altura1 = 4;
        // Llama al método para calcular el área del salón.
        int area1 = calcularAreaRectangulo(base1, altura1);

        // Muestra area 1
        System.out.println("--- Salón ---");
        System.out.println("Base: " + base1);
        System.out.println("Altura: " + altura1);
        System.out.println("El área es: " + area1 + " m²");


        // Declara la base de la cocina y le asigna el valor 3.
        int base2 = 3;
        // Declara la altura de la cocina y le asigna el valor 3.
        int altura2 = 3;
        // Llama al método para calcular el área de la cocina.
        int area2 = calcularAreaRectangulo(base2, altura2);

        // Muestra area 2
        System.out.println("--- Cocina ---");
        System.out.println("Base: " + base2);
        System.out.println("Altura: " + altura2);
        System.out.println("El área es: " + area2 + " m²");


        // Declara la base del jardín y le asigna el valor 10.
        int base3 = 10;
        // Declara la altura del jardín y le asigna el valor 6.
        int altura3 = 6;
        // Llama al método para calcular el área del jardín.
        int area3 = calcularAreaRectangulo(base3, altura3);

        // Muestra area 3
        System.out.println("--- Jardín ---");
        System.out.println("Base: " + base3);
        System.out.println("Altura: " + altura3);
        System.out.println("El área es: " + area3 + " m²");
    }
}
