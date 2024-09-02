package com.proyectoz;

public class Flor extends Planta {
    private String colorPetalos;
    private Integer cantPromPetalos;
    private String colorPistillo;
    private String variedadFlor;
    private String estacionQueFlorece;

    enum estacionFlorece {
        VERANO, OTOÑO, INVERNO, PRIMAVERA
    }

    public Flor(){}
    public Flor(String nombre) {
        super(nombre);
    }
    public Flor(String nombre,String colorPetalos) {
        this(nombre);
        this.colorPetalos = colorPetalos;
    }
    public Flor(String nombre,String colorPetalos, Integer cantPromPetalos) {
        this(nombre,colorPetalos);
        this.cantPromPetalos = cantPromPetalos;
    }
    public Flor(String nombre,String colorPetalos, Integer cantPromPetalos, String colorPistillo) {
        this(nombre,colorPetalos,cantPromPetalos);
        this.colorPistillo = colorPistillo;
    }
    public Flor(String nombre,String colorPetalos, Integer cantPromPetalos, String colorPistillo, String variedadFlor) {
        this(nombre,colorPetalos,cantPromPetalos,colorPistillo);
        this.variedadFlor = variedadFlor;
    }
    public Flor(String nombre,String colorPetalos, Integer cantPromPetalos, String colorPistillo, String variedadFlor, String estacionQueFlorece) {
        this(nombre,colorPetalos,cantPromPetalos,colorPistillo,variedadFlor);
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public Integer getCantPromPetalos() {
        return cantPromPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public void setCantPromPetalos(Integer cantPromPetalos) {
        this.cantPromPetalos = cantPromPetalos;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "colorPetalos='" + colorPetalos + '\'' +
                ", cantPromPetalos=" + cantPromPetalos +
                ", colorPistillo='" + colorPistillo + '\'' +
                ", variedadFlor='" + variedadFlor + '\'' +
                ", estacionQueFlorece='" + estacionQueFlorece + '\'' +
                '}';
    }

    public String sayHello(){
        return ("Hola soy una "+this.getNombre());
    }


    @Override
    public void decirQueSoy(){
        System.out.println("Hola soy una Flor");
    }
}


