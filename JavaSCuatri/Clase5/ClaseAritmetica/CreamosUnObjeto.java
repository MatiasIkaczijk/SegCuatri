package Clase5.ClaseAritmetica;

import Clase4Completa.Leccion4.Aritmetica.Operaciones;

public class CreamosUnObjeto {
       
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        miMetodo(); // llamamos el metodo nuevo 

        Operaciones aritmetica1 = new Operaciones(); // llamamos al intructor
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumaNum();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado: " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: " + resultado);
        
        // Mod CLASE 6
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        Operaciones aritmetica2 = new Operaciones(5,8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
    }

    // MOD CLASE 6. MODULARIDAD 

    public static void miMetodo(){
        // int a = 10;
        System.out.println("Aquí hay otro metodo");
    }
}
