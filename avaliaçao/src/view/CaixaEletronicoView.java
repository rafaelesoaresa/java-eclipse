package view;

import java.util.Scanner;

public class CaixaEletronicoView {


    private Scanner scanner;

    public CaixaEletronicoView() {
        scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("n/ seja bem vindo");
        System.out.println("Caixa Eletrônico - Escolha uma opção:");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar");
        System.out.println("4. Sair");
        System.out.print("Opção: ");
        return scanner.nextInt();
    }

    public double solicitarValor(String operacao) {
        System.out.print("Digite o valor para " + operacao + ": R$");
        return scanner.nextDouble();
    }

    public void exibirSaldo(double saldo) {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}



