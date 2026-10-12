/*      1. escibe un programa en java que evalue las siguientes expresiones
        2. muestra el resultado de cada expresion y explica que oepradores tienen mayor
precedencia
        3. una operadores aritmeticos, relacionales, logicos y operadores de asignacion.
*/
/*
expresiones:
    1. 10 + 5 * 2 > 20 && 4 == 4
    2. !(7 + 3 > 10) || 3 * 2 <= 6
    3. 10 / 2 + 3 * 5 == 19 && true
    4. int x = 5; x += 3 * 2
    5. boolean b = false; b = !b || 7 % 2 == 1
*/


import java.util.Scanner;

public class ejercicio26 {

    public static void main(String[] args) {

        // 1. Operadores aritméticos, relacionales y lógicos
        boolean resultado1 = 10 + 5 * 2 > 20 && 4 == 4;

        // 2. Operadores aritméticos, relacionales y lógicos
        boolean resultado2 = !(7 + 3 > 10) || 3 * 2 <= 6;

        // 3. Operadores aritméticos, relacionales y lógicos
        boolean resultado3 = 10  / 2 + 3 * 5 == 19 && true;
        // 4. Operadores aritméticos, relacionales y lógicos
        int x = 5;
        x +=3 * 2;
        
        // 5. Operadores aritméticos, relacionales y lógicos
        boolean b =  false; b = !b || 7 % 2 == 1;
        
        // Mostramos los resultados
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
        System.out.println("Resultado 4 (x): " + x);
        System.out.println("Resultado 5 (b): " + b);
        
    }
}