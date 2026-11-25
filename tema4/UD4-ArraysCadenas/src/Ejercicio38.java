/*
Validador de usuarios de una plataforma
Nivel intermedio-avanzado
Enunciado
Una plataforma web necesita validar los datos de registro de sus usuarios. Vamos a crear un programa que compruebe si un nombre de usuario y una contraseña cumplen una serie de requisitos.
Requisitos del nombre de usuario
El nombre de usuario:
    Debe tener entre 5 y 12 caracteres.
    Solo puede contener letras, números y guion bajo (_).
    Debe comenzar por una letra.
Ejemplos:
Usuario         Resultado
fran_25         Válido
alumno2026      Válido
2alumno         No válido
fran@25         No válido
abc             No válido

Requisitos de la contraseña
La contraseña:
    Debe tener al menos 8 caracteres.
    Debe contener al menos una letra mayúscula.
    Debe contener al menos una letra minúscula.
    Debe contener al menos un número.
    Debe contener al menos un carácter especial de entre !, @, #, $ o %.
   
Ejemplos:
Contraseña          Resultado
JavaDAW25!          Válida
programacion1A#     Válida
java12345           No válida
JAVADAW25!          No válida
JavaDAW!            No válida
JavaDAW25           No válida

Apartados
    Solicitar el nombre de usuario.
    Comprobar si cumple todos los requisitos.
    Solicitar una contraseña.
    Comprobar si cumple todos los requisitos.
    Mostrar por separado qué validaciones ha superado y cuáles no.
    Indicar si el registro puede completarse.
Pistas para resolverlo
Para el usuario:
    ^[a-zA-Z][a-zA-Z0-9_]{4,11}$
Para la contraseña, se pueden utilizar varias comprobaciones independientes con matches():
Requisito                               Patrón
Al menos 8 caracteres                   .{8,}
Contiene mayúscula                      .*[A-Z].*
Contiene minúscula                      .*[a-z].*
Contiene un número                      .*\\d.*
Contiene carácter especial permitido    .*[!@#$%].*

*/

/**
 *
 * @author Maitane Navarro
 */
public class Ejercicio38 {
    
}
