package ProyectoUD4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Maitane Navarro y Miguel Ángel
 */
import java.util.Scanner;

public class Proyecto22 {

    public static void mostrarAlumnos(String[] nombres, double[] notas) {
        System.out.println("===== LISTA DE ALUMNOS =====");

        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i] + " - " + notas[i]);
        }
    }

    //calcular la nota media
    public static double calcularMedia(double[] notas) {
        double suma = 0;

        // recorrido de las notas 
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    // calcular la nota maxima
    public static double calcularMaximo(double[] notas) {
        double maxima = notas[0];

        // recorrido de notas y encontrar la nota maxima
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maxima) {
                maxima = notas[i];
            }
        }

        return maxima;
    }

    // calcular la nota minima
    public static double calcularMinimo(double[] notas) {
        double minima = notas[0];

        // recorrido de notas y encontrar la nota minima
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < minima) {
                minima = notas[i];
            }
        }

        return minima;
    }

    // contar los aprobados
    public static int contarAprobados(double[] notas) {
        int aprobados = 0;

        // recorrido de notas hasta encontrar las mayores de 5
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }

        return aprobados;
    }

    // contar los suspensos
    public static int contarSuspensos(double[] notas) {
        int suspensos = 0;

        //reccorrido de notas hasta encontrar las menores de 5
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                suspensos++;
            }
        }

        return suspensos;
    }

    //mostrar las notas
    public static void mostrarEstadisticas(double[] notas) {
        System.out.println("===== ESTADISTICAS =====");
        System.out.println("Media: " + calcularMedia(notas));
        System.out.println("Nota maxima: " + calcularMaximo(notas));
        System.out.println("Nota minima: " + calcularMinimo(notas));
        System.out.println("Aprobados: " + contarAprobados(notas));
        System.out.println("Suspensos: " + contarSuspensos(notas));
    }

    // busqueda de alumnos que esten metidos
    public static int buscarAlumno(String[] nombres, String nombreBuscado) {

        // recorremos para ver si esta el nombre
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                return i;
            }
        }

        return -1;
    }

    //mostrar alumnos aprobados
    public static void mostrarAprobados(String[] nombres, double[] notas) {
        System.out.println("===== ALUMNOS APROBADOS =====");

        // recorrido de notas superiores a 5
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(nombres[i] + " - " + notas[i]);
            }
        }
    }

    // contar las vocales del nombre
    public static int contarVocales(String texto) {
        int vocales = 0;

        // pasar de mayusculas a minusculas
        texto = texto.toLowerCase();

        // recorrido por nombres contando vocales
        for (int i = 0; i < texto.length(); i++) {
            // contar las letras de un nombre
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e'
                    || letra == 'i' || letra == 'o'
                    || letra == 'u' || letra == 'á'
                    || letra == 'é' || letra == 'í'
                    || letra == 'ó' || letra == 'ú') {

                vocales++;
            }
        }

        return vocales;
    }

    // analizar nombre alumno 
    public static void analizarNombre(Scanner teclado) {
        System.out.print("Introduce un nombre: ");
        String nombre = teclado.next();

        System.out.println("Numero de vocales: " + contarVocales(nombre));
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] nombres = {"Ana", "Carlos", "Maria", "Pablo", "Lucia"};
        double[] notas = {8.5, 4.2, 9.0, 6.3, 3.8};

        int opcion = -1;

        while (opcion != 0) {

            System.out.println("\n===== GESTOR DE ALUMNOS =====");
            System.out.println("1. Mostrar todos los alumnos");
            System.out.println("2. Mostrar estadisticas de notas");
            System.out.println("3. Buscar alumno por nombre");
            System.out.println("4. Mostrar alumnos aprobados");
            System.out.println("5. Analizar un nombre");
            System.out.println("0. Salir");

            System.out.print("Selecciona una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    mostrarAlumnos(nombres, notas);
                    break;

                case 2:
                    mostrarEstadisticas(notas);
                    break;

                case 3:
                    System.out.print("Introduce el nombre del alumno: ");
                    String nombreBuscado = teclado.next();

                    int posicion = buscarAlumno(nombres, nombreBuscado);

                    if (posicion != -1) {
                        System.out.println("Alumno encontrado: "
                                + nombres[posicion] + " - "
                                + notas[posicion]);
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 4:
                    mostrarAprobados(nombres, notas);
                    break;

                case 5:
                    analizarNombre(teclado);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }
        }

        teclado.close();
    }
}
