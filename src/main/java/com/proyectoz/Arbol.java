package com.proyectoz;

public class Arbol extends Planta{
    private String variedad;
    private String tipoTronco;
    private Float radioTronco;
    private String color;
    private String tipoHoja;

    public Arbol(){}
    public Arbol(String nombre) {
        super(nombre);
    }
    public Arbol(String nombre, String variedad) {
        super(nombre);
        this.variedad = variedad;
    }
    public Arbol(String nombre, String variedad, String tipoTronco) {
        this(nombre,variedad);
        this.tipoTronco = tipoTronco;
    }
    public Arbol(String nombre, String variedad, String tipoTronco, Float radioTronco) {
        this(nombre,variedad,tipoTronco);
        this.radioTronco = radioTronco;
    }
    public Arbol(String nombre, String variedad, String tipoTronco, Float radioTronco, String color) {
        this(nombre,variedad,tipoTronco,radioTronco);
        this.color = color;
    }
    public Arbol(String nombre, String variedad, String tipoTronco, Float radioTronco, String color, String tipoHoja) {
        this(nombre,variedad,tipoTronco,radioTronco,color);
        this.tipoHoja = tipoHoja;
    }

    public String getVariedad() {
        return variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public Float getRadioTronco() {
        return radioTronco;
    }

    public String getColor() {
        return color;
    }

    public String getTipoHoja() {
        return tipoHoja;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public void setRadioTronco(Float radioTronco) {
        this.radioTronco = radioTronco;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoHoja(String tipoHoja) {
        this.tipoHoja = tipoHoja;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "variedad='" + variedad + '\'' +
                ", tipoTronco='" + tipoTronco + '\'' +
                ", radioTronco=" + radioTronco +
                ", color='" + color + '\'' +
                ", tipoHoja='" + tipoHoja + '\'' +
                '}';
    }

    public String sayHello(){
        return ("Hola soy un "+getNombre());
    }


    @Override
    public void decirQueSoy(){
        System.out.println("Hola soy un Arbol");
    }


}
