# Intenta escribir por tu cuenta un programa que haga lo siguiente:
# Pida al usuario su año de nacimiento usando input() (recuerda usar int()).
# Calcule la edad que cumplirá en el año 2026 mediante una resta (2026 - año_nacimiento).
# Muestre un mensaje en pantalla diciendo: "En el año 2026 tendrás X años."


# Pedimos el año de nacimiento y lo convertimos en un número entero
año_nacimiento = int(input("¿En qué año naciste? "))

# Calculamos la edad que cumplirá en el año 2026
edad = 2026 - año_nacimiento

# Mostramos la edad por pantalla
print("En el año 2026 tendrás", edad, "años.")
