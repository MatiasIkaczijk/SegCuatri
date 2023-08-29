# ¿Qué es un diccionario? coleccion de datos ordenados de manera particular

# "Maradona" : 10 --> el conjunto de datos es un diccionario

# UNA LLAVE Y UN VALOR
# dict(key,value)

diccionario = { 
    "IDE" : "Integrated Development Environment",
    "POO" : "Programacion Orientada a Objetos",
    "SABD" : "Sistema de Administracion de Base de Base de Datos"
}
# mostramos el diccionario con tres elementos
print(diccionario)

#verificar cant de elementos
print(len(diccionario))

# como acceder al diccionario con la llave (key)
print(diccionario["IDE"])

# otra forma de recuperar un elemento 
print(diccionario.get("POO"))
print(diccionario.get("SABD"))

# modificar un elemento 
diccionario["IDE"] = " Entorno de Desarrollo Integrado"
print(diccionario)
