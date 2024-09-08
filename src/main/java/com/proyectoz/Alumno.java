package com.proyectoz;

public class Alumno extends Persona {
    private String institucion;
    private Integer notaMatematica, notaHistoria;


    public Alumno(Integer dni, String nombre, Integer edad, String institucion){
        super(dni,nombre,edad);
        this.institucion=institucion;
        this.notaMatematica=null;
        this.notaHistoria=null;
    }
    public String getInstitucion() {
        return institucion;
    }

    public Integer getNotaMatematica() {
        return notaMatematica;
    }

    public Integer getNotaHistoria() {
        return notaHistoria;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setNotaMatematica(Integer notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public void setNotaHistoria(Integer notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
