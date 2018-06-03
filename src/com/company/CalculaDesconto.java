package com.company;

public class CalculaDesconto {
    public void conta(Valor valor, Desconto desconto){
        System.out.println("Desconto sera de:");
        System.out.println(desconto.calcula(valor));
        System.out.println("Logo sera pago: \n" + desconto.valorFinal(valor));

    }
}
