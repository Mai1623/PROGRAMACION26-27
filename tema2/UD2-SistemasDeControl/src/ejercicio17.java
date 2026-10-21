
/*
Mostrar usando un for y el continue solo los numeros pares desde el 1 al 10.
*/

/**
 *
    Maitane
 */


public class ejercicio17 {
    public static void main(String[] args) {
        // Iniciamos desde el 1 y que vaya hasta el 10, incrementando de 1 en 1
        for (int num = 1; num <= 10; num++) {
            // Lo dividimos entre 2 y que el resto sea 0 para que sea par
            if (num % 2 != 0) { // usamos != porque "no es igual a"
                //que continue hasta el final saltando los impares
                continue;
            }
            System.out.println(num);
        }
    }
}