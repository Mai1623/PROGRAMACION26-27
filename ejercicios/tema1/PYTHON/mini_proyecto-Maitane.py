# Desarrollar un programa pequeño que combine varios de los conceptos aprendidos:
# pedir datos al usuario, almacenarlos en variables, realizar cálculos con operadores,
# usar alguna constante, mostrar resultados, añadir comentarios, realizar conversión de
# tipos. (Ej: Una calculadora básica, un conversor simple de unidades).
# Requisitos:
    # ● Se debe realizar en parejas en una sesión de clase
    # ● Un sólo repositorio en GitHub compartido por la pareja
    # ● Usar un lenguaje de programación (Python, Java, Javascript…)

    # Evaluación:
    # ● Se expondrá en clase mediante una demo de no más de 5 minutos
    # ● Habrá que responder a las preguntas de la audiencia
    # ● La calificación es la misma para ambos miembros de la pareja
    # ● Ambos miembros deben responder por separado con lo que ambos tienen que
    # conocer todo el proyecto


# Constantes
IVA = 0.21
PORCENTAJE_PROPINA = 0.10

# Pedir datos al usuario
nombre = input("Introduce tu nombre: ")
precio = float(input("Introduce el precio de la cuenta: "))
personas = int(input("¿Entre cuantas personas se reparte la cuenta? "))

# Realizar los calculos
importe_iva = precio * IVA
total_con_iva = precio + importe_iva
propina = total_con_iva * PORCENTAJE_PROPINA
total_final = total_con_iva + propina
importe_persona = total_final / personas

# Mostrar los resultados
print("\n===== RESUMEN DE LA CUENTA =====")
print("Cliente:", nombre)
print("Precio inicial:", round(precio, 2), "euros")
print("IVA (21%):", round(importe_iva, 2), "euros")
print("Total con IVA:", round(total_con_iva, 2), "euros")
print("Propina (10%):", round(propina, 2), "euros")
print("Total final:", round(total_final, 2), "euros")
print("Importe por persona:", round(importe_persona, 2), "euros")
print("================================")
