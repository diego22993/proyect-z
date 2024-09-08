package com.proyectoz;

import jdk.jshell.DeclarationSnippet;

public class Persona {
    private Integer dni;
    private String nombre;
    private Integer edad;

    public Persona(){
    }
    public Persona(Integer dni, String nombre, Integer edad){
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
    }
    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        return "";
    }
}
