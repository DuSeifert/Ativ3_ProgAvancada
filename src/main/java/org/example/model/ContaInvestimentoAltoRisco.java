package org.example.model;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{

    protected double saldoMinimo;

    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.taxaSaque = 1.05;
        this.saldoMinimo = 10000;
    }

    @Override
    public void sacar(double valor) {
        if(saldo >= saldoMinimo && (valor * taxaSaque) <= saldo){
            saldo -= valor * taxaSaque;
            System.out.printf("\nValor sacado de %.2f \n", valor);
        }
        else{
            System.out.println("\nSaldo insuficiente para sacar.\n");
        }
    }

}
