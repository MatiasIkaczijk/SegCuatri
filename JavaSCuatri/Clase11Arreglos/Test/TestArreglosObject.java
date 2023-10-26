package Clase11Arreglos.Test;

import Clase11Arreglos.domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        // Agregamos nuevas referecnias
        personas[0] = new Persona("Matias");
        personas[1] = new Persona("Jorge");
        
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);
        

    }
}
