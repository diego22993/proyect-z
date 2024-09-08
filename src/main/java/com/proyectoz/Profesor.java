package com.proyectoz;

public class Profesor extends Persona {
    private Integer legajo;
    private String catedra;

    public Profesor(Integer legajo, String catedra){
        super();
        this.legajo=legajo;
        this.catedra=catedra;
    }
    public Profesor(Integer dni, String nombre, Integer edad, Integer legajo, String catedra){
        super(dni,nombre,edad);
        this.legajo=legajo;
        this.catedra=catedra;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }
}
