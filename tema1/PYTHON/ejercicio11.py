# Ejercicio 11: Reparto de Caramelos (División Entera y Módulo)
# Objetivo: Diferenciar el uso de la división flotante /, la división entera // y el residuo %.
  #   • Enunciado: Un profesor tiene un paquete de caramelos para repartir en
  #         partes iguales entre sus estudiantes. Escribe un programa que solicite:
   #      ◦ La cantidad total de caramelos.
   #      ◦ La cantidad de alumnos presentes.
   #  • El programa debe calcular e imprimir:
    #     ◦ Cuántos caramelos completos le corresponden a cada alumno (sin romper caramelos).
    #     ◦ Cuántos caramelos sobran en la bolsa.



#Introducir datos
caramelos = input ("¿Cuantos caramelos hay en total? ")
alumnos = input ("¿Cuantos alumnos hay? ")

#Valor de las variables
caramelos = int (caramelos)
alumnos = int (alumnos)

#Calcular caramelos por alumno
dividir = (caramelos // alumnos)

#Sacar el resto
#tambien se puede poner resto = (caramelos % alumnos )
resto = (caramelos - (alumnos * dividir))

#imprimir
print (" - - - Repartición caramelos - - -")
print ("Cantidad de caramelos: ", caramelos, )
print ("Cantidad de alumnos: ", alumnos, )
print ("Cada alumno recibe:  ", dividir, ("caramelos") )
print ("Sobran en la bolsa: ", resto, ("caramelos") )
