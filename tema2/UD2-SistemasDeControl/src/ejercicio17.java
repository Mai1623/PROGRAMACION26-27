/*
Imagina que tienes un array con los precios de varios productos en un carrito
de compras. Quieres sumar el total, pero hay un problema: algunos productos
tienen un precio negativo por un error del sistema o un cupón mal aplicado.
Queremos saltar esos precios incorrectos y no sumarlos al total.
Requisitos:
    Usa este array de prueba: double[] precios = {10.5, -5.0, 20.0, -1.2, 5.5};
    Recorre el array con un bucle (for o for-each).
    Si el precio es menor o igual a cero (precio <= 0), usa continue para saltar ese elemento sin sumarlo.
    Al final del bucle, imprime el total de la suma (el resultado correcto debería ser 36.0).
💡 Pista para el Ejercicio 16
Crea una variable double total = 0; antes del bucle. Dentro del bucle, evalúa
el precio actual con un if. Si es negativo, ejecuta continue. La línea
total += precio; debe ir justo debajo de ese if, para que solo se ejecute si
no se activó el salto.

*/

/**
    @author Maitane
 */
public class ejercicio17 {
    
}
