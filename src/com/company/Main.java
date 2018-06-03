package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("insira o valor do produto");
        Scanner bot = new Scanner(System.in);
        double tot = bot.nextDouble();
        System.out.println("insira o deconto obtido");
        double val = bot.nextDouble();
        Valor nomeDeUmValor = new Valor(tot);
        Porcentagem desconto = new Porcentagem(val);

        CalculaDesconto abc = new CalculaDesconto();
        abc.conta(nomeDeUmValor,desconto);
    }
}
