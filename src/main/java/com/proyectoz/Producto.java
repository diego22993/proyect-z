package com.proyectoz;

public class Producto {
    private Integer codigo;
    private String nombre;
    private Double precio;

    public Producto(){}
    public Producto(Integer codigo){
        this.codigo=codigo;
    }
    public Producto(Integer codigo, String nombre){
        this(codigo);
        this.nombre=nombre;
    }
    public Producto(Integer codigo, String nombre, Double precio){
        this(codigo,nombre);
        this.precio=precio;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public Double getPrecio() {
        return precio;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
