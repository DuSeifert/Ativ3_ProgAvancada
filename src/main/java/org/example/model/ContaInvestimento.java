package org.example.model;

import org.example.ContaBancaria;

public class ContaInvestimento extends ContaBancaria {

    protected double taxaSaque;

    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.taxaSaque = 1.02;
    }

    @Override
    public void sacar(double valor) {

        if((valor * taxaSaque) <= saldo){
            saldo -= valor * taxaSaque;
            System.out.printf("\nValor sacado de %.2f \n", valor);
        }
        else{
            System.out.println("\nSaldo insuficiente para sacar.\n");
        }

    }

}
