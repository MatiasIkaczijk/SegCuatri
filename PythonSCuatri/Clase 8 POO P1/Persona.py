class Persona:
# Atributos o características --> metodo init(permite inicializar metodos)

    def __init__(self): # self: Llama a traves de este y el init, uno mismo, al objeto hace referencia
        self.nombre = "Matias"
        self.apellido = "Ikz" # atributos
        self.edad = 22
persona1 = Persona() #constructor, instancia

print(persona1.apellido)
print(persona1.nombre)
print(persona1.edad)

# Creación de objetos con argumentos
class Persona2:
    def __init__(self, nombre,apellido, edad): # self: Llama a traves de este y el init, uno mismo, al objeto hace referencia
        self.nombre = nombre
        self.apellido = apellido # variables
        self.edad = edad
persona = Persona2("Arturo", "Lope", "33") # enviamos argumetos

print(persona.apellido)
print(persona.nombre)
print(persona.edad)