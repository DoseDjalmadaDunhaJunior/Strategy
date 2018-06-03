package com.company;

public class Porcentagem implements Desconto{
    public Porcentagem(double a){
        cem = a;
    }

    @Override
    public double calcula(Valor valor) {
        aux = valor.porc * (cem/100);
        return aux;
    }

    @Override
    public double valorFinal(Valor valor) {
        return valor.porc - aux;
    }

    private double aux;
    private double cem;
}
