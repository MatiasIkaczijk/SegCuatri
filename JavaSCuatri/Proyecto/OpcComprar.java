package Proyecto;

import java.util.Scanner;

public class OpcComprar { 
    // SUBP Opc Comprar

    public static void opcComprar(int opcComprar, int carro, char comboDia, char opcCarrito, int opcEnvio, int Productos, int X, int inv, int total, String saveDom[], int dom_inv){
        JOptionPane.showMessageDialog(null,"1: Mostrar combos disponibles");
        JOptionPane.showMessageDialog(null,"2: Mostrar combo del día");
        JOptionPane.showMessageDialog(null,"3: Volver atrás");
        opcComprar = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción:"));

        switch (opcComprar) {
            case 1:
                mostrarCombos();
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Combo del día: Tacos + papas + cerveza + helado");
                JOptionPane.showMessageDialog(null,"El precio del combo del día es de: $4000");
                JOptionPane.showMessageDialog(null,"¿Desea comprar este combo? (s/n)");
                comboDia = JOptionPane.showInputDialog("¿Desea comprar este combo? (s/n)").charAt(0);

                while (comboDia == 'S' || comboDia == 's') {
                    carro = Carrito(carro, 4000);
                    productos = ProductosCarrito(productos, "Tacos + papas + cerveza + helado");
                    mostrar_carrito(carro, productos);

                    do {
                        String opcCarritoStr = JOptionPane.showInputDialog("¿Desea agregar algo más al carrito? (S/N)");
                        opcCarrito = opcCarritoStr.charAt(0);

                        if (opcCarrito == 'S' || opcCarrito == 's') {
                            opcionesArmar();
                        } else if (opcCarrito == 'N' || opcCarrito == 'n') {
                            mostrar_carrito(carro, productos);
                             opcEnvio = Integer.parseInt(JOptionPane.showInputDialog("Desea...\n1 - Retirar en el local.\n2 - Envío a domicilio."));

                            if (opcEnvio == 2) {
                                JOptionPane.showMessageDialog(null, "Ha seleccionado -Envío a Domicilio-");
                                JOptionPane.showMessageDialog(null, "El costo de envío es de $200.");
                                JOptionPane.showMessageDialog(null, "El monto total es de: $" + (carro + 200));

                                if (inv) {
                                    dom_inv = JOptionPane.showInputDialog("Por favor, ingrese su domicilio:");
                                    fin_compra();
                                } else {
                                    if (saveDom[x].equals("")) {
                                        saveDom[x] = JOptionPane.showInputDialog("Domicilio no cargado. Por favor, ingrese su domicilio:");
                                        fin_compra();
                                    } else {
                                        fin_compra();
                                    }
                                }
                            } else if (opcEnvio == 1) {
                                JOptionPane.showMessageDialog(null, "Ha seleccionado -Retirar en el local-");
                                JOptionPane.showMessageDialog(null, "El monto total es de: $" + carro);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error. Opción no válida. Ingrese nuevamente.");
                        }
                    } while (opcCarrito != 'N' && opcCarrito != 'n' && opcCarrito != 'S' && opcCarrito != 's');
                }
                break;
            case 3:
                System.out.println("Volver atrás\n");
                menu();
                break;
        }
    }

    public static void mostrarCombos() {
        // Implementa la lógica para mostrar los combos disponibles
    }

    public static int Carrito(int carro, int precio) {
        // Implementa la lógica para agregar productos al carrito y actualizar el total
        return carro + precio;
    }

    public static String[] ProductosCarrito(String[] productos, String nuevoProducto) {
        // Implementa la lógica para agregar productos al arreglo de productos del carrito
        // Devuelve el arreglo actualizado
        return productos;
    }

    public static void mostrar_carrito(int carro, String[] productos) {
        // Implementa la lógica para mostrar el contenido del carrito
    }

    public static void opcionesArmar() {
        // Implementa la lógica para agregar más productos al carrito
    }

    public static void fin_compra() {
        // Implementa la lógica para finalizar la compra
    }

    public static void menu() {
        // Implementa la lógica del menú principal
    }
}