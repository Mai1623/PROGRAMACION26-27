# Desglose de Tiempo en Formato Digital
# Objetivo: Convertir una unidad de tiempo grande en horas, minutos y segundos utilizando operaciones enteras.
# Enunciado: Solicita al usuario una cantidad total de segundos (ejemplo: 9254) y calcula cuántas horas, minutos y segundos representan.

# Pedimos al usuario la cantidad total de segundos
segundos = int(input("Introduce la cantidad total de segundos: "))

# Calculamos cuántas horas completas hay en esos segundos
horas = segundos // 3600

# Calculamos los segundos que sobran después de obtener las horas
segundos = segundos % 3600

# Calculamos cuántos minutos completos hay en los segundos restantes
minutos = segundos // 60

# Calculamos los segundos que sobran después de obtener los minutos
segundos = segundos % 60

# Mostramos el resultado final en horas, minutos y segundos
print("Horas:", horas)
print("Minutos:", minutos)
print("Segundos:", segundos)
