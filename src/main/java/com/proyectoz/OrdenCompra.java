package com.proyectoz;
import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    private Integer id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    public OrdenCompra(){}

    public OrdenCompra(Integer id, String descripcion, Date fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "OrdenCompra{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", productos=" + Arrays.toString(productos) +
                '}';
    }
}
