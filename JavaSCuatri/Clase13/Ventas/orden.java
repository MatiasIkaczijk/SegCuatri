package Clase13.Ventas;

import Clase13.Ventas.Producto.Producto;

public class orden {
    // carga de atributos encapsulados
    private int idOrden;
    private Producto productos[];
    private int contadorProducto;
    private static int contadorOrdenes;
    private static final int MAXPRODUCTOS = 10; // constante 

    // const vacio
    public orden(){
        this.idOrden = ++orden.contadorOrdenes; //aumento idOrden
        this.productos = new Producto[orden.MAXPRODUCTOS];
    }

    // metodo que combina clase prod con clase orden. 
    // Agrega productos
    public void agregarProducto(Producto producto){ // agrega siempre y cuando no supere a 10prod
        // cont prod
        if(this.contadorProducto < orden.MAXPRODUCTOS){
            this.productos[this.contadorProducto++] = producto; // lee la var y sufre incremento
        }
        else{
            System.out.println("Se ha superado el maximo de productos.. " + orden.MAXPRODUCTOS);
        }
    }

}
