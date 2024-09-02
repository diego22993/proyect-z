package com.proyectoz;

public abstract class Planta {
    private String nombre;
    private int altoTallo;
    private boolean tieneHojas;
    private enum climaPerfecto  {
        FRIO, HUMEDO, SOLEADO
    }
    private String climaIdeal;

    public Planta(){}

    public Planta (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltoTallo() {
        return altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltoTallo(int altoTallo) {
        this.altoTallo = altoTallo;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public String visualizarInfo(){
        return ("Nombre: "+nombre+", Alto Tallo: "+altoTallo+", Tiene hojas: "+tieneHojas+", Clima ideal: "+climaIdeal);
    }

    public String sayHello(){
        return ("Hola soy una "+nombre);
    }


    public abstract void decirQueSoy();
}
