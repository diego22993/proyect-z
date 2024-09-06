package com.proyectoz;

public class ItemFactura {
    private Producto producto;
    private Integer cantidad;

    public ItemFactura() {}
    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto=producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
    public Integer getCantidad() {
        return cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ItemFactura{" +
                "producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }
}
