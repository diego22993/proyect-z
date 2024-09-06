package com.proyectoz;

public class Cliente {
    private String nombre;
    private String nif;


    public Cliente() {
    }
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public Cliente(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }
    public String getNif() {
        return nif;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }
}
