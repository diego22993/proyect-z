package com.proyectoz;

public class Main {
    public static void main(String[] args) {


        Arbol arbolito = new Arbol("Arbolinio","Roble","Anchazo",30.4f);
        Flor florcita = new Flor("Florcinia","Rojos",30,"Verde","Claveles","Invierno");
        Flor florcita2 = new Flor("Florcinia_2","Verdes",40,"Verde");
        Arbusto arbustito = new Arbusto("Arbustinio");
        Arbusto arbustito2 = new Arbusto("Arbustinio",200,true,"Robledo","Verdes+amarillo",false);

        arbolito.decirQueSoy();
        florcita.decirQueSoy();
        florcita2.decirQueSoy();
        arbustito.decirQueSoy();
        arbustito2.decirQueSoy();
    }
}