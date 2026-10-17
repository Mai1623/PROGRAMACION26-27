/*
7. Año bisiesto: Determinar si un año ingresado por el usuario es bisiesto.
Un año es bisiesto si cumple las condiciones:
    a. Un año es bisiesto si es divisible entre 4.
    b. Excepto los años que son múltiplos de 100, que no son bisiestos.
    c. Salvo que además sean divisibles entre 400, en cuyo caso sí lo son
*/



import java.util.Scanner; // Importamos Scanner para leer datos por teclado.

public class ejercicio7 { // Declaramos la clase principal.

    public static void main(String[] args) { // Método principal donde comienza el programa.

        Scanner teclado = new Scanner(System.in); // Creamos el Scanner para leer el año.

        System.out.println("Introduce un año:"); // Pedimos al usuario que introduzca un año.

        int anio = teclado.nextInt(); // Leemos el año y lo guardamos en la variable anio.

        if (anio % 400 == 0) { // Comprobamos si el año es divisible entre 400.
            System.out.println("El año " + anio + " es bisiesto."); // Si lo es, es bisiesto.

        } else if (anio % 100 == 0) { // Si no es divisible entre 400, comprobamos si lo es entre 100.
            System.out.println("El año " + anio + " no es bisiesto."); // Si lo es, no es bisiesto.

        } else if (anio % 4 == 0) { // Si no es múltiplo de 100, comprobamos si es divisible entre 4.
            System.out.println("El año " + anio + " es bisiesto."); // Si lo es, es bisiesto.

        } else { // Si no cumple ninguna de las condiciones anteriores.
            System.out.println("El año " + anio + " no es bisiesto."); // El año no es bisiesto.
        } // Cerramos la estructura condicional.

        teclado.close(); // Cerramos el Scanner.
    } // Cerramos el método main.
} // Cerramos la clase AnioBisiesto.
