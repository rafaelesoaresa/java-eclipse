package main;

import controller.PessoaController;
import doa.PessoaDAO;
import view.PessoaView;

public class Main {
    public static void main(String[] args) {
        PessoaDAO pessoaDAO = new PessoaDAOMemoria();
        PessoaController pessoaController = new PessoaController(pessoaDAO);
        PessoaView pessoaView = new PessoaView(pessoaController);

        pessoaView.exibirMenu();
    }
}

