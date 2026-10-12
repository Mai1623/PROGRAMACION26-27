# Ejercicio 12: Verificador de Elegibilidad para Descuento
# Objetivo: Construir expresiones booleanas complejas usando and, or, not y
# operadores de comparación.
  #   Enunciado: Una tienda ofrece un descuento especial a los clientes
  #   si cumplen cualquiera de las siguientes condiciones:
    #     Es cliente mayor de 65 años.
     #    Es estudiante Y la compra supera los 50 euros.
 #    Escribe un programa que solicite al usuario:
      #   Su edad (int).
      #   Si es estudiante (pedir "si" o "no" y convertirlo a un valor booleano).
     #    El monto total de su compra (float).
    # El programa debe evaluar la condición e imprimir un mensaje
    # booleano (True o False) que indique si tiene derecho al descuento.


edad = int(input("Edad: "))
estudiante = input("¿Es estudiante? (si/no): ").lower() == "si"
compra = float(input("Monto de compra: "))
descuento = (edad > 65) or (estudiante and compra > 50)
print("¿Aplica descuento?:", descuento)

