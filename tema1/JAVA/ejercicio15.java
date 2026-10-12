/// Crear un programa GestionInventario.java (ejercicio15.java) que declare la
///cantidad de pociones de un jugador (int), su precio unitario (double) y un
///estado de mochila llena (boolean).

//Simular la compra de 3 pociones de la siguiente forma:
// - Descontando el importe de un total de oro guardado en otra variable.
// - Mostrando el estado final de la mochila como llena.

public class ejercicio15 {
	public static  void main(String[] args) {
            // variables
           int cantidadPociones = 5;
           double precioPocion = 15.5;
           boolean mochilaLlena = false;
           double oro = 58.00;
           
           // Comprar 3 pociones
           int pocionesCompradas = 3;
           double importe = pocionesCompradas * precioPocion;
           
            // Descontar oro del importe
            oro = oro - importe;
           
           // añadimos pociones compradas
           cantidadPociones = cantidadPociones + pocionesCompradas;
           
           // mochila queda llena
           mochilaLlena = true;
           
          // imprimir resultados
        System.out.println("Pociones: " + cantidadPociones);
        System.out.println("Oro restante: " + oro);
        System.out.println("Mochila llena: " + mochilaLlena);
    }
}


