# Ejercicio 13: Generador de Tique de Compra con Impuestos y Propina
# Objetivo: Combinar todos los conceptos vistos en un solo script estructurado.
# ● Enunciado:
    # Crea un programa para una cafetería que genere el desglose final de una cuenta.
    # Debe pedir:
        # ○ Nombre del cliente (str).
        # ○ Nombre del producto (str).
        # ○ Precio unitario (float).
        # ○ Cantidad comprada (int).
        # ○ Porcentaje de IVA aplicable (ej. 21 para 21%).
        # ○ ¿Desea incluir propina opcional de 2€? (pedir "si" o "no").
    # ● El programa debe calcular:
        # ○ Subtotal básico (Precio x Cantidad).
        # ○ Monto del IVA (Subtotal x IVA/100).
        # ○ Total final con IVA y propina (si aplica).
        # ○ Una validación lógica que devuelva True si el total gastado supera los 30€
        # (considerado "Cliente VIP").

cliente = input("Nombre del cliente: ")
producto = input("Nombre del producto: ")
precio = float(input("Precio unitario: "))
cantidad = int(input("Cantidad comprada: "))
iva = float(input("Porcentaje de IVA: "))
propina_respuesta = input("¿Desea incluir propina? (si/no): ").lower()

# Calcular subtotal e IVA
subtotal = precio * cantidad
monto_iva = subtotal * iva / 100

# Calcular propina
if propina_respuesta == "si":
    propina = 2.0
else:
    propina = 0.0

# Calcular total antes de comprobar si es VIP
total = subtotal + monto_iva + propina

# Comprobar si el cliente es VIP
cliente_vip = total > 30

# Mostrar el tique
print("====================================")
print("        TIQUE DE CAFETERÍA")
print("====================================")
print("Cliente:", cliente)
print("Producto:", producto, "x", cantidad)
print("------------------------------------")
print("Subtotal:", round(subtotal, 2), "€")
print(f"IVA ({iva:g}%): {round(monto_iva, 2)} €")
print("Propina:", round(propina, 2), "€")
print("TOTAL A PAGAR:", round(total, 2), "€")
print("------------------------------------")
print("¿Supera el umbral VIP (>30€)?:", cliente_vip)
print("====================================")
