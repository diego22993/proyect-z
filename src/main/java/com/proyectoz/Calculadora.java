package com.proyectoz;

public class Calculadora {


    public Integer sumar(Integer... argumentos){
        Integer total = 0;
        for (Integer argumento : argumentos) {
            total+=argumento;
        }
        return total;
    }

    public Float sumar(Float... argumentos){
        Float total = 0f;
        for (Float argumento : argumentos) {
            total+=argumento;
        }
        return total;
    }
}
