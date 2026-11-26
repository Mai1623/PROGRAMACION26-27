/*
Diseña tu propia clase
Nivel intermedio
Una aplicación necesita representar videojuegos.
Cada videojuego tiene:
Título.
Plataforma.
Año de lanzamiento.
Precio.
Si está disponible o no.
Y permite realizar las siguientes acciones:
Mostrar información.
Cambiar el precio.
Marcar como disponible.
Marcar como no disponible.
Tareas:
Escribe la estructura de la clase Videojuego.
Declara sus cinco atributos.
Define los cuatro métodos.
Añade comentarios para identificar atributos y métodos.
No es necesario crear todavía objetos ni utilizar constructores.
Solución orientativa:
public class Videojuego {

    // Atributos
    String titulo;
    String plataforma;
    int anio;
    double precio;
    boolean disponible;

    // Métodos
    void mostrarInformacion() {
        System.out.println(titulo);
        System.out.println(plataforma);
        System.out.println(anio);
        System.out.println(precio);
        System.out.println(disponible);
    }

    void cambiarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
    }

    void marcarDisponible() {
        disponible = true;
    }

    void marcarNoDisponible() {
        disponible = false;
    }

}


*/

/**
 *
 * @author 06_1DAW
 */
public class Ejercicio5 {
    
}
