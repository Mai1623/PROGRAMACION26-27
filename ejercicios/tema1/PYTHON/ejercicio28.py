# Escribir un programa que solicite las notas del primer, segundo y tercer trimestre
# (notas enteras que se solicitarán al usuario).

# El programa debe mostrar la nota media del curso como aparece en el boletín de
# calificaciones (solo la parte entera) y como se usa en el expediente académico
# (con decimales).

# Solicitar las notas de los tres trimestres
nota1 = float(input("Introduce la nota del primer trimestre: "))
nota2 = float(input("Introduce la nota del segundo trimestre: "))
nota3 = float(input("Introduce la nota del tercer trimestre: "))

# Calcular la nota media
media = (nota1 + nota2 + nota3) / 3

# Mostrar los resultados
print("Nota media en el boletín:", int(media))
print("Nota media en el expediente académico:", media)
