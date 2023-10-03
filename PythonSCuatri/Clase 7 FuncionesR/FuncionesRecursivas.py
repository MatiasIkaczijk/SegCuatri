# FUNCION RECURSIVA: .. Se manda a llamar a si misma para completar una tarea..
# Tiene dos fases: caso base y caso recursivo 

def factorial(numero): # recibimos num, envia arg, recibimos como parametro y nuestra funcion encuentra el resul
    if numero == 1:
        return 1 # caso base
    else:
        return numero * factorial(numero - 1) # caso recursivo
resultado = factorial(5) # codigo duro
print(f" El factorial del numero 5 es: {resultado}")

# Para hacer la tarea q nos pide. Haria una entrada de info con un input, solicitando q ingrese un numero
