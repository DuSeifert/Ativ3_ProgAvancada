package org.example.model;

import org.example.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);

    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            System.out.printf("\nValor sacado de %.2f \n", valor);
        }
        else{
            System.out.println("\nSaldo Insuficiente.\n");
        }
    }

}
