package com.proyectoz;
import static com.proyectoz.Calculadora.*;

public class Main {
    public static void main(String[] args) {
        //Calculadora ca = new Calculadora();

        Integer suma = sumar(2,3,4,10,4);
        Float suma2 = sumar(2f,3f,4f,10f,4f);


        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la suma c/flota es: "+suma2);
    }
}
