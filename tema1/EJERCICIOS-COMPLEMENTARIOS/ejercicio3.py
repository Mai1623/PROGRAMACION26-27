# Simulador Financiero e Interés Compuesto
# Objetivo: Trabajar con potencias (**), fórmulas matemáticas completas y redondeo.
# Enunciado: Calcula el capital final acumulado con interés compuesto: A = P * (1 + r)^t. Compara si el capital final proyectado supera o iguala una meta deseada mediante un valor booleano.

# Pedimos al usuario el capital inicial en euros
P = float(input("Introduce el capital inicial en euros: "))

# Pedimos el interés anual en porcentaje
r = float(input("Introduce el interés anual en porcentaje: "))

# Convertimos el interés de porcentaje a decimal
r = r / 100

# Pedimos el número de años de la inversión
t = int(input("Introduce el número de años: "))

# Pedimos la meta económica que queremos alcanzar
meta = float(input("Introduce la meta económica en euros: "))

# Calculamos el capital final con la fórmula del interés compuesto
A = P * (1 + r) ** t

# Redondeamos el capital final a dos decimales
capital_final = round(A, 2)

# Comparamos el capital final con la meta deseada
objetivo_alcanzado = A >= meta

# Mostramos el capital final acumulado
print("Capital final:", capital_final, "€")

# Mostramos si se ha alcanzado la meta mediante un booleano
print("¿Se alcanza la meta?", objetivo_alcanzado)
