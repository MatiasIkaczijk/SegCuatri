package JavaSCuatri.Leccion2;
public class Clase1{
    public static void main(String[] args) {
        var conteo = 0; // inf de tipo
        // CICLO WHILE
        while (conteo < 7) { // si esta condicion no se cumple, no podremos ver el codigo del prog
            System.out.println("Conteo = " + conteo);
            conteo++; // va incrementando uno

            // ciclo Do WHILE: Por lo menos una vez se ejecuta el ciclo
            var contador = 0;
            do{
                System.out.println("contador = " + contador);
                contador++;
            }while (contador <= 7);

            // 1er espacio se declara la variable, 2do condicion a cumplir, 3ro: incremento o decremento de la var(recorrido)
            for( var cont = 0 ; cont < 7 ; cont++) {
                System.out.println(" cont = " + cont);
            }






        }
    }
}