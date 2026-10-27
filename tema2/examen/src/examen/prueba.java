package examen;

/**
 *
 * @author 06_1DAW
 */
public class prueba {
    public static void main(String[] args) {
        int contadorPares=0;
        int i = 1;
        while (i <= 5){
            if (i % 2 == 0){
                contadorPares++;
            }
            i++;
        }
        System.out.println("Pares encontrados: " + contadorPares);
    }
}
