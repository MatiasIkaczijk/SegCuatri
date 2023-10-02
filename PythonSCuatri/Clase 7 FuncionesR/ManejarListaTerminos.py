def ListaTerminos(**terminos): # kwards -->llaves, paramentros y argumentos
    for llave, valor in terminos.items(): # --> items para recorrer diccionario
        print(f"{llave} : {valor}")
ListaTerminos(IDE = "Integrated Develoment Enviroment", PK = "Primary Key")  # pasamos terminos
ListaTerminos(Nombre = "Leo Messi")

# Funcionamiento:
#                 1: Recibe arg
#                 2: Convierte en paramentros
#                 3: Hace la operacion y muestra el diccionario