#Ejercicio 9
#objetivo: practica input (), type () y conversión  explicita de datos.
#Escribe un programa que solicite al usuario:
 #   1. Su nombre
  #  2. Su año de nacimiento
   # 3. Su altura en metros (1.75 ejemplo)

#el programa debe:
 #   • convertir el año de nacimiento a numero entero y calcular su edad aproximada al año actual (2026)
  #  • convertir la altura a decimal (float)
   # • imprimir en pantalla los tipos de datos de cada variable convertida usando la función type().
    #• Mostrar un mensaje final con toda la información integrada

# Introducir datos
nombre = input ("Cual es tu nombre: ")
nacimiento = input ("En que año naciste: ")
altura = input ("Cual es tu altura: ")

nombre = str (nombre)
nacimiento = int (nacimiento)
altura = float (altura)

#Calcular edad
edad = 2026 - nacimiento #Año actual - año nacimiento

#imprimir por pantalla
print ("- - - FICHA REGISTRADA - - -")
print ("Nombre: ", nombre, "(Tipo:", type(nombre), ")")
print ("Edad: ", edad,"(Tipo:",  type(edad), ")")
print ("Altura: ", altura,"(Tipo:",   type(altura), ")")
