package org.example;

import org.example.model.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = null;
        ContaPoupanca cp = null;
        ContaInvestimento ci = null;
        ContaSalario cs = null;
        ContaInvestimentoAltoRisco ciar = null;

        Scanner sc = new Scanner(System.in);

        int opc1, opc2, tipoConta = 0;
        double saque, deposito;
        boolean continuar = true, alterarConta = true;

        System.out.println("\nBancos Eduardo, De vez em quando com dinheiro");

        do{

            if (alterarConta) {

                System.out.println("\nEscolha o tipo de conta:");
                System.out.println("\n\t1 -- Conta Corrente\n\t2 -- Conta Poupança\n\t3 -- Conta investimento\n\t4 -- Conta Salário\n\t5 -- Conta investimento alto risco\n\n\t0 -- Sair");

                do{
                    opc1 = sc.nextInt();
                    sc.nextLine();
                }while(opc1 < 0 || opc1 > 5);

                switch (opc1) {
                    case 1:
                        cc = new ContaCorrente(123, getTitular(), getSaldo());
                        System.out.println("\nConta Corrente selecionada.\n");

                        break;
                    case 2:
                        cp = new ContaPoupanca(234, getTitular(), getSaldo());
                        System.out.println("\nConta Corrente Poupança selecionada.\n");

                        break;
                    case 3:
                        ci = new ContaInvestimento(345, getTitular(), getSaldo());
                        System.out.println("\nConta Investimento selecionada.\n");

                        break;
                    case 4:
                        cs = new ContaSalario(456, getTitular(), getSaldo());
                        System.out.println("\nConta Salário selecionada.\n");

                        break;
                    case 5:
                        ciar = new ContaInvestimentoAltoRisco(567, getTitular(), getSaldo());
                        System.out.println("\nConta Investimento Alto Risco selecionada.\n");

                        break;

                    default:
                        continuar = false;
                        break;
                }

                tipoConta = opc1;

            }

            alterarConta = false;

            if(continuar){
                do {
                    System.out.println("\n\tTerminal:\n\n\t1 -- Sacar\n\t2 -- Depositar\n\t3 -- Exibir informações\n\t4 -- Alterar tipo de conta\n\n\t0 -- Sair\n");

                    opc2 = sc.nextInt();
                    sc.nextLine();

                    switch (opc2) {
                        case 1:
                            System.out.println("\nQual o valor que deseja sacar?");
                            saque = sc.nextDouble();
                            sc.nextLine();

                            switch (tipoConta) {
                                case 1:
                                    cc.sacar(saque);
                                    break;
                                case 2:
                                    cp.sacar(saque);
                                    break;
                                case 3:
                                    ci.sacar(saque);
                                    break;
                                case 4:
                                    cs.sacar(saque);
                                    break;
                                case 5:
                                    ciar.sacar(saque);
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("\nQual o valor que deseja depositar?");
                            deposito = sc.nextDouble();
                            sc.nextLine();

                            switch (tipoConta) {
                                case 1:
                                    cc.depositar(deposito);
                                    break;
                                case 2:
                                    cp.depositar(deposito);
                                    break;
                                case 3:
                                    ci.depositar(deposito);
                                    break;
                                case 4:
                                    cs.depositar(deposito);
                                    break;
                                case 5:
                                    ciar.depositar(deposito);
                                    break;
                            }
                            break;

                        case 3:
                            switch (tipoConta) {
                                case 1:
                                    cc.exibirInformacoes();
                                    break;
                                case 2:
                                    cp.exibirInformacoes();
                                    break;
                                case 3:
                                    ci.exibirInformacoes();
                                    break;
                                case 4:
                                    cs.exibirInformacoes();
                                    break;
                                case 5:
                                    ciar.exibirInformacoes();
                                    break;
                            }
                            break;

                        case 4:
                            System.out.println("\nTrocando conta...\n");
                            alterarConta = true;
                            break;

                        default:
                            if (opc2 != 0) {
                                System.out.println("\nOpção incorreta.\n");
                            } else {
                                continuar = false;
                            }
                            break;
                    }

                } while (opc2 != 0 && !alterarConta);
            }

        } while (continuar);

        System.out.println("\nBye bye :(");
    }


    static String getTitular(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");

        return sc.nextLine();
        }

    static double getSaldo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo inicial da conta: ");

        double valor = sc.nextDouble();
        sc.nextLine();

        return valor;
    }


}