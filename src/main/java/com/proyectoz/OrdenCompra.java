package com.proyectoz;
import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    private Integer id = 0;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    public OrdenCompra(){}
    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.productos = new Producto[4];
        this.cliente = new Cliente();
    }
    public OrdenCompra(Integer id, String descripcion, Date fecha, Cliente cliente, Producto[] productos) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
    }

    public OrdenCompra(String descripcion, Cliente cliente) {
        this(descripcion);
        this.cliente = cliente;
    }
    public OrdenCompra(String descripcion, Cliente cliente,Producto[] productos) {
        this(descripcion,cliente);
        this.productos=productos;
    }

    public Integer getId() {
        return id++;
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

    public void addProducto(Producto producto){
        int indice = 0;
        while (indice<productos.length && productos[indice] == null){
            indice++;
        }
        if (indice<productos.length){
            productos[indice]=producto;
        }else{
            System.out.println("El array de Productos está lleno");
        }
    }

    public Integer granTotal(Producto[] productos){
        Integer res = 0;
        for (Producto dto : productos){
            res += dto.getPrecio();
        }
        return res;
    }

    public int incrementarID(){
        return (id+1);
    }
    @Override
    public String toString() {
        return "OrdenCompra{" +
                "id=" + incrementarID() +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", productos=" + Arrays.toString(productos) +
                '}';
    }
}
