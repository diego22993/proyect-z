package com.proyectoz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Factura taxA;
        Factura taxB;

        Cliente c1 = new Cliente("Rodrigo Peña","37988923");
        Cliente c2 = new Cliente("Jorgito soles","992305");
        Cliente c3 = new Cliente("Dario Ñañez","5607321");

        Producto p1 = new Producto(001,"Taladro",350000.00);
        Producto p2 = new Producto(002,"Pinza",5600.70);
        Producto p3 = new Producto(003,"Soldadora",900500.00);
        Producto p4 = new Producto(004,"Alambre",10000.99);

        Producto[] productos = {
                new Producto(001,"Taladro",350000.00),
                new Producto(002,"Pinza",5600.70),
                new Producto(003,"Soldadora",900500.00),
                new Producto(004,"Alambre",10000.99)
        };

/*        for (Producto producto : productos) {
            System.out.println("Valores: "+ producto.toString());
        }

 */
        ItemFactura itemA = new ItemFactura(p1,2);
        ItemFactura itemB = new ItemFactura(p2,10);
        ItemFactura itemC = new ItemFactura(p3,1);
        ItemFactura itemD = new ItemFactura(p4,40);

        ItemFactura[] items = {
                itemA,itemB,itemC,itemD
        };



        taxA = new Factura(c1,items[3],10,"Factura-Mercado Pago");
        Double importeTotal = 0.0;

        //taxB = new Factura(c2,itemB,20,"Factura-Marketplace");
        System.out.println("\n #### Datos de la factura #### \n");
        for (int i = 0; i < items.length; i++) {
            System.out.println("Item NRO:"+i);
            System.out.println("Nombre: "+items[i].getProducto().getNombre());
            System.out.println("Precio: "+items[i].getProducto().getPrecio());
            System.out.println("Cantidad: "+items[i].getCantidad());
            importeTotal += items[i].calcularImporte();
            System.out.println("IMPORTE: $"+importeTotal+"\n");
        }

        /*for (int i = 0; i < items.length; i++) {
            importeTotal += items[i].calcularImporte();
        }

        System.out.println("Total Importe : $"+importeTotal);

         */
    }
}
