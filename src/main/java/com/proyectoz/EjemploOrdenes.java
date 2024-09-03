package com.proyectoz;


public class EjemploOrdenes {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Diogo","Heratia");
        Producto[] productos = new Producto[4];


        Producto p1 = new Producto("Toyota","Producto-03",770);
        Producto p2 = new Producto("Peugeot","Producto-02",300);
        Producto p3 = new Producto("Chevrolet","Producto-01",560);
        Producto p4 = new Producto("Fiat","Producto-00",450);

        OrdenCompra ordenCompra = new OrdenCompra("OrdenCompra-007", new Cliente("Diogo","Heratia"),new Producto[4]);
        ordenCompra.addProducto(p1);
        ordenCompra.addProducto(p2);
        ordenCompra.addProducto(p3);
        ordenCompra.addProducto(p4);
    /*

        addProducto(p1);
        addProducto(p2);
        addProducto(p3);
        addProducto(p4);

        System.out.println("Los valores son: "+ p1.toString());
        System.out.println("Los valores son: "+ p2.toString());
        System.out.println("Los valores son: "+ p3.toString());
        System.out.println("Los valores son: "+ p4.toString());


     */
        System.out.println("Datos orden compra: "+ordenCompra.toString());

    }
}