
public class Calculadora {

    // Sumar dos numeros
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Restar dos numeros
    public static double restar(double a, double b) {
        return a - b;
    }

    // Multiplicar dos numeros
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Dividir dos numeros
    public static double dividir(double a, double b) {

        if (b == 0) {
            return 0;
        }

        return a / b;
    }
}
