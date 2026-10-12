/** Diseñar un algoritmo que nos indique si podemos salir a la calle.
existen aspectos que influyen  en esta decision: si esta lloviendo 
y si hemos acabado nuestras tareas. Existe una opcion en la que,
indistintamente  de lo anterior, podemos salir a la calle: el hecho de 
que tengamos que ir a la biblioteca (para realizar algun trabajo, entregar
un libro, etc.).
Solicitar al usuario (mediante booleano) si llueve, si ha finalizado las tareas
y si necesita ir a la biblioteca. El algoritmo debe mostrar mediante un booleano
(true o false) si es posible que se le otorgue permiso para ir a la calle.*/

import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        //leer lo que escribimos
        Scanner teclado = new Scanner(System.in);
        
        // Preguntar si llueve (LAS RESPUESTAS TIENEN QUE SER TRUE o FALSE)
        System.out.print("¿Está lloviendo? : ");
        boolean llueve = teclado.nextBoolean();

        // Preguntar si ha acabado las tareas
        System.out.print("¿Has terminado las tareas? : ");
        boolean tareasTerminadas = teclado.nextBoolean();

        // Preguntar si tiene que ir a la biblioteca
        System.out.print("¿Necesitas ir a la biblioteca? : ");
        boolean biblioteca = teclado.nextBoolean();
        
        // Comprobar las dos comparaciones y con el simbolo ! tienen que ser
        //las dos true
        boolean permiso = (!llueve && tareasTerminadas) || biblioteca;

        //Segun lo que ponga en el booleano de permiso, puede salir o no
        System.out.println("¿Puedes salir a la calle? " + permiso);

        teclado.close();
        
    }
}
