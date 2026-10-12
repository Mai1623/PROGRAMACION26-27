# Ejercicio 10: Conversor de Temperatura
# Conversión de Celsius a Fahrenheit

celsius = float(input("Introduce la temperatura en grados Celsius: ").replace(",", "."))

fahrenheit = (celsius * 9 / 5) + 32

print("Temperatura en Celsius:", str(celsius).replace(".", ",") + " °C")
print("Temperatura en Fahrenheit:", str(round(fahrenheit, 1)).replace(".", ",") + " °F")
