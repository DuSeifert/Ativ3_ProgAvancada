package org.example.model;

import org.example.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

    protected double chequeEspecial;

    public ContaCorrente(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.chequeEspecial = 500;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo + chequeEspecial) {
            saldo -= valor;

            if(saldo < 0) {
                chequeEspecial += saldo;
                saldo = 0;
            }

            System.out.printf("\nValor sacado de %.2f \n", valor);
        }
        else{
            System.out.println("\nSaldo Insuficiente.\n");
        }
    }

}
