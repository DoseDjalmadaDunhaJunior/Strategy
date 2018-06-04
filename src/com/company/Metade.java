package com.company;

public class Metade implements Desconto{
    public Metade(double a){
        cem = a;
    }
    @Override
    public double calcula(Valor valor) {
        return valor.porc * (cem/50);
    }

    @Override
    public double valorFinal(Valor valor) {
        return valor.porc - aux;
    }

    public double cem;
    public double aux;
}
