// El tipo short permite almacenar valores comprendidos entre -32768 y
// 32767. Escribir un programa que compruebe que el rango de valores de
// un tipo se comporta de forma cíclica, es decir, el valor siguiente al
// máximo es el valor mínimo.
public class ejercicio19 {

    public static void main(String[] args) {
        // numero maximo que se almacena
        short valor = 32767;
        
        // imprime el valor maximo
        System.out.println("Valor máximo: " + valor);

        // se va incrementando +1
        valor++;

        // imprime el siguiente valor porque el 32768 no entra,
        // entonces empieza de nuevo, en este caso -32768
        System.out.println("Siguiente valor: " + valor);
    }
}
