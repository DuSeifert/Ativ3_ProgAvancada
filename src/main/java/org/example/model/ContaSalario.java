package org.example.model;

public class ContaSalario extends ContaCorrente{

    private int contSaque;


    public ContaSalario(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.contSaque = 0;
        this.chequeEspecial = 500;
    }

    @Override
    public void sacar(double valor) {
        if(contSaque == 0){
            super.sacar(valor);
        }
        else{
            super.sacar(valor+5);
        }
        contSaque++;
        System.out.printf("\nValor sacado de %.2f \n", valor);
    }

    public void virarMes(){
        contSaque = 0;
    }
}
