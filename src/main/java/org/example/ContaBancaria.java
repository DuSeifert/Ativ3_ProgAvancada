package org.example;

public abstract class ContaBancaria {

    protected int numeroConta;
    protected double saldo;
    protected String titular;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("\nValor depositado com sucesso.\n");
    }

    public abstract void sacar(double valor);

    public void exibirInformacoes(){
        System.out.println("{" +
                "\n\tTitular ----------- " + titular +
                "\n\tSaldo da conta ---- " + saldo +
                "\n\tNúmero da conta --- " + numeroConta +
                "\n}");
    }

}
