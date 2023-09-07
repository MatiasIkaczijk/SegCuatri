package Clase4Completa;

// 4.2 CREACION DE UN OBJETO, a partir de la persona (parte de arriba)

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); // llama al constructor Persona desde el objeto y permite asignar valor
        persona1.nombres = "Matias"; // atributos
        persona1.apellidos = "Ikaczijk";

        // llamamos al metodo (recibe los valores y los imprime) con el objeto
        
        persona1.ObtenerInformacion(); // Muestra los valores del atributo en la clase

    }
}
