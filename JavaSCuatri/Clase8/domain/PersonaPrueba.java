package Clase8.domain;

public class PersonaPrueba {
    public static void main(String[] args) {
        // poder acceder al metodo solo poniendo el nombre
        Persona Persona1 = new Persona("Anabel");
        System.out.println(" Persona1 = " + Persona1);

        // creamos otro obj
        Persona Persona2 = new Persona("Jesus");
        System.out.println("Persona2 = " + Persona2);
    }
}
