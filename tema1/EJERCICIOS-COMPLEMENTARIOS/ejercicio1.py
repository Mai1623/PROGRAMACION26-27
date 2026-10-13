
# Algoritmo del Cajero Automático
# Objetivo: Desarrollar pensamiento lógico encadenando la división entera (//) y el resto (%) sin recurrir a estructuras condicionales (if).
# Enunciado: Dado un monto entero de euros (ejemplo: 188€), calcula el desglose mínimo en billetes de 50€, 20€, 10€, 5€ y monedas de 1€.



# Pedimos al usuario que introduzca una cantidad entera de euros
euros = int(input("Introduce una cantidad de euros: "))
# Calculamos cuántos billetes de 50 € necesitamos
billetes50 = euros // 50
# Calculamos el dinero que sobra después de utilizar los billetes de 50 €
euros = euros % 50
# Calculamos cuántos billetes de 20 € necesitamos
billetes20 = euros // 20

# Calculamos el dinero que sobra después de utilizar los billetes de 20 €
euros = euros % 20

# Calculamos cuántos billetes de 10 € necesitamos
billetes10 = euros // 10

# Calculamos el dinero que sobra después de utilizar los billetes de 10 €
euros = euros % 10

# Calculamos cuántos billetes de 5 € necesitamos
billetes5 = euros // 5

# Calculamos el dinero que sobra después de utilizar los billetes de 5 €
euros = euros % 5

# El dinero que queda corresponde a monedas de 1 €
monedas1 = euros

# Mostramos el desglose final de billetes y monedas
print("Billetes de 50 €:", billetes50)
print("Billetes de 20 €:", billetes20)
print("Billetes de 10 €:", billetes10)
print("Billetes de 5 €:", billetes5)
print("Monedas de 1 €:", monedas1)
