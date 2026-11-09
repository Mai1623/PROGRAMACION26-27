

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double num1, num2;
        int opcion;

        System.out.println("===== CALCULADORA =====");

        System.out.print("Introduce el primer numero: ");
        num1 = teclado.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        num2 = teclado.nextDouble();

        System.out.println("Introduce una opcion: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.print("Elige una operacion: ");
        opcion = teclado.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Resultado: "
                        + Calculadora.sumar(num1, num2));
                break;

            case 2:
                System.out.println("Resultado: "
                        + Calculadora.restar(num1, num2));
                break;

            case 3:
                System.out.println("Resultado: "
                        + Calculadora.multiplicar(num1, num2));
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir entre cero");
                } else {
                    System.out.println("Resultado: "
                            + Calculadora.dividir(num1, num2));
                }
                break;

            default:
                System.out.println("Opcion incorrecta");
        }

        teclado.close();
    }
}
