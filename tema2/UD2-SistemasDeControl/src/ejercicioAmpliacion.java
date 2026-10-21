/*
Desarrolla un programa Java que simule el acceso a un sistema mediante un PIN de cuatro cifras.
El PIN correcto es 2580. El usuario dispone de un máximo de tres intentos.
El programa debe cumplir las siguientes condiciones:
    Solicita un PIN al usuario.
    Mientras el PIN sea incorrecto y queden intentos disponibles, vuelve a solicitarlo.
    Si el usuario introduce el PIN correcto, muestra Acceso concedido.
    Si agota los tres intentos sin acertar, muestra Acceso bloqueado.
    Después de cada PIN incorrecto, muestra los intentos que le quedan.
    Utiliza un bucle while con la condición al principio. No utilices for ni do-while.
Ejemplo de ejecución 1
    Introduce el PIN: 1234
    PIN incorrecto. Te quedan 2 intentos.
    Introduce el PIN: 1111
    PIN incorrecto. Te quedan 1 intentos.
    Introduce el PIN: 2580
    Acceso concedido.
Ejemplo de ejecución 2
    Introduce el PIN: 1234
    PIN incorrecto. Te quedan 2 intentos.
    Introduce el PIN: 1111
    PIN incorrecto. Te quedan 1 intentos.
    Introduce el PIN: 9999
    PIN incorrecto. Te quedan 0 intentos.
    Acceso bloqueado.
Pistas para resolverlo (intentar no mirarlas al principio)
    Utiliza una variable pinCorrecto, otra pinIntroducido y otra intentos.
    Inicializa intentos a 3.
    La condición del while debe comprobar dos cosas: que el PIN sea incorrecto y que queden intentos.
    Recuerda actualizar las variables dentro del bucle para evitar que se repita indefinidamente.
    Ampliación
    Modifica el programa para que, cuando el usuario acierte el PIN, también muestre cuántos intentos ha necesitado.
 */

/**
 *
 * @author Maitane
 */
public class ejercicioAmpliacion {
    
}
