package Clase4Completa.Leccion4.Aritmetica;

public class Operaciones { // pascalcase para clases
    // Atributos de la clase
    public int a;
    public int b;

    // Metodo
    public void sumaNum(){ // camelcase para metodos/atributos
        // cuerpo de la clase. Var locales
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }
    public int sumarConRetorno(){ // regresa un entero
        int resultado = a + b; // mediante esta variable
        // o bien poner: return a + b;
        return resultado; // retorna el valor de una expresion y transporta a una variable entera 
    }
    // Paso de Argumentos
    public int sumarConArgumentos(int arg1 , int arg2){
        a = arg1; // no modifica los valores
        b = arg2;
        // o bien podemos hacer:
        // return sumarConArgumentos
        return a + b;
    }
    // El operador this, hace que se dif los atributos de los argumentos
    public int sumarConRetorno(int a, int b){
        this.a = a; // el argumento se asigna al atributo this.a 
        this.b = b;
        return this.sumarConRetorno();
    }
}
