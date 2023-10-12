package Clase9Herencia.Test;

import Clase9Herencia.Domain.Empleado;

public class TestHerencia {
    // lo que sucede cuando se llama a la class empleado, ve que está vacia
    // pero al ser hija de la class Persona, va y muestra los atributos vacios..
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        System.out.println("Empleado1 = " + empleado1);
    }
}
