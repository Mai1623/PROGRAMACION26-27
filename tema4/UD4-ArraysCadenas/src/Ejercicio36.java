/*
Analizador de frases
Solicita una frase y muestra:
    Número de caracteres.
    Número de vocales.
    Número de consonantes.
    Número de dígitos.
    Número de espacios.
    Número de palabras.
    Frase invertida.
Ejemplo:
    Texto: Java es genial 2026

    Caracteres: 19
    Vocales: 5
    Consonantes: 6
    Dígitos: 4
    Espacios: 3
    Palabras: 4
 */

/**
 *
 * @author Maitane Navarro
 */

import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedir una frase
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        // Convertir a minúsculas
        String fraseMinuscula = frase.toLowerCase();

        // Inicializar contadores
        int vocales = 0;
        int consonantes = 0;
        int digitos = 0;
        int espacios = 0;

        // Variable para invertir la frase
        String invertida = "";

        // Recorrer la frase
        for (int i = 0; i < frase.length(); i++) {

            // Obtener cada carácter
            char letra = fraseMinuscula.charAt(i);

            // Contar vocales
            if (letra == 'a' || letra == 'e'
                    || letra == 'i' || letra == 'o'
                    || letra == 'u') {

                vocales++;

                // Contar dígitos
            } else if (Character.isDigit(letra)) {

                digitos++;

                // Contar espacios
            } else if (letra == ' ') {

                espacios++;

                // Contar consonantes
            } else if (Character.isLetter(letra)) {

                consonantes++;
            }

            // Invertir la frase
            invertida = letra + invertida;
        }

        // Calcular número de palabras
        int palabras = 0;

        if (!frase.trim().isEmpty()) {
            palabras = frase.trim().split("\\s+").length;
        }

        // Mostrar resultados
        System.out.println("Caracteres: " + frase.length());
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        System.out.println("Digitos: " + digitos);
        System.out.println("Espacios: " + espacios);
        System.out.println("Palabras: " + palabras);
        System.out.println("Frase invertida: " + invertida);

        teclado.close();
    }
}
