# La función input() siempre recibe los datos como texto. Si deseas hacer operaciones matemáticas con lo que escribe
# el usuario, debes convertir ese texto en un número entero usando int().


# Pedimos el primer número al usuario y lo convertimos en entero
numero1 = int(input("Escribe el primer número: "))

# Pedimos el segundo número al usuario y lo convertimos en entero
numero2 = int(input("Escribe el segundo número: "))

# Sumamos los dos números
suma = numero1 + numero2

# Mostramos el resultado de la suma
print("La suma es:", suma)

# Restamos los dos números
resta = numero1 - numero2

# Mostramos el resultado de la resta
print("La resta es:", resta)

# Multiplicamos los dos números
multiplicacion = numero1 * numero2

# Mostramos el resultado de la multiplicación
print("La multiplicación es:", multiplicacion)
