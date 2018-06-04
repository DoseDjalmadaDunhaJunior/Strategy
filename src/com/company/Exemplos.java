package com.company;

import java.util.Scanner;

public class Exemplos {
    public void exemplo2(){
        System.out.println("insira o valor do produto");
        Scanner bot = new Scanner(System.in);
        double tot = bot.nextDouble();
        System.out.println("insira o deconto obtido");
        double val = bot.nextDouble();
        Valor nomeDeUmValor = new Valor(tot);
        Porcentagem desconto = new Porcentagem(val);
        CalculaDesconto abc = new CalculaDesconto();
        abc.conta(nomeDeUmValor,desconto);
        System.out.println("se tivesse 50% de desconto o produto seria");
        Metade met = new Metade(tot);

    }

    public void exemplo1(){
        Interface um = new UmValor();
        Interface dois = new OutroValor();

        PMaximo pMaximo = new PMaximo(5);

        InterfassePContas hp = new InterfassePContas();

        hp.GPS(pMaximo,um);
        hp.GPS(pMaximo,dois);
    }
}
