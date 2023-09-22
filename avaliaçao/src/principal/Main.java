package principal;

import java.util.Scanner;

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
}

class CaixaEletronicoView {
    private Scanner scanner;

    public CaixaEletronicoView() {
        scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("\nCaixa Eletrônico - Escolha uma opçao:");
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

class CaixaEletronicoController {
    private ContaBancaria conta;
    private CaixaEletronicoView view;

    public CaixaEletronicoController() {
        conta = new ContaBancaria(1000.0); 
        view = new CaixaEletronicoView();
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    view.exibirSaldo(conta.getSaldo());
                    break;
                case 2:
                    double valorSaque = view.solicitarValor("saque");
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    double valorDeposito = view.solicitarValor("depósito");
                    conta.depositar(valorDeposito);
                    break;
                case 4:
                    view.exibirMensagem("Saindo do sistema.");
                    break;
                default:
                    view.exibirMensagem("Opção inválida.");
                    break;
            }
        } while (opcao != 4);
    }
}

public class Main {
    public static void main(String[] args) {
        CaixaEletronicoController controller = new CaixaEletronicoController();
        controller.iniciar();
    }
}

