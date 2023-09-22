package controller;

import model.ContaBancaria;
import view.CaixaEletronicoView;

public class CaixaEletrotronicoController {
    private ContaBancaria conta;
    private CaixaEletronicoView view;

    public CaixaEletrotronicoController() {
        conta = new ContaBancaria(1000.0); // Saldo inicial de R$1000
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
