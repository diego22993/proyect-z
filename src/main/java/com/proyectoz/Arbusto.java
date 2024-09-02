package com.proyectoz;

public class Arbusto extends Planta {
    private Integer ancho;
    private boolean esDomestico;
    private String variedad;
    private String colorHojas;
    private boolean sePoda;

    public Arbusto(){}
    public Arbusto(String nombre) {
        super(nombre);
    }
    public Arbusto(String nombre,Integer ancho) {
        this(nombre);
        this.ancho = ancho;
    }
    public Arbusto(String nombre,Integer ancho, boolean esDomestico) {
        this(nombre,ancho);
        this.esDomestico = esDomestico;
    }
    public Arbusto(String nombre,Integer ancho, boolean esDomestico, String variedad) {
        this(nombre,ancho,esDomestico);
        this.variedad = variedad;
    }
    public Arbusto(String nombre,Integer ancho, boolean esDomestico, String variedad, String colorHojas) {
        this(nombre,ancho,esDomestico,variedad);
        this.colorHojas = colorHojas;
    }
    public Arbusto(String nombre,Integer ancho, boolean esDomestico, String variedad, String colorHojas,Boolean sePoda) {
        this(nombre,ancho,esDomestico,variedad,colorHojas);
        this.sePoda = sePoda;
    }

    public Integer getAncho() {
        return ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }

    @Override
    public String toString() {
        return "Arbusto{" +
                "ancho=" + ancho +
                ", esDomestico=" + esDomestico +
                ", variedad='" + variedad + '\'' +
                ", colorHojas='" + colorHojas + '\'' +
                ", sePoda=" + sePoda +
                '}';
    }

    public String sayHello(){
        return ("Hola soy un "+this.getNombre());
    }

    @Override
    public void decirQueSoy(){
        System.out.println("Hola soy un Arbusto");
    }
}

