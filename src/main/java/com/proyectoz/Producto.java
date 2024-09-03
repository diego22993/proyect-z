package com.proyectoz;

public class Producto {
    private String fabricante;
    private String nombre;
    private Integer precio;

    public Producto(){}

    public Producto(String fabricante, String nombre, Integer precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "fabricante='" + fabricante + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
