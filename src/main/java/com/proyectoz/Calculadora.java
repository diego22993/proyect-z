package com.proyectoz;

public class Calculadora {

    private Calculadora(){}

    public static Integer sumar(Integer... argumentos){
        Integer total = 0;
        for (Integer argumento : argumentos) {
            total+=argumento;
        }
        return total;
    }

    public static Float sumar(Float... argumentos){
        Float total = 0f;
        for (Float argumento : argumentos) {
            total+=argumento;
        }
        return total;
    }
}
