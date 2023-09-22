package view;

import java.util.List;
import java.util.Scanner;

import controller.PessoaController;
import model.Pessoa;

public class PessoaView {
    private PessoaController pessoaController;

    public PessoaView(PessoaController pessoaController) {
        this.pessoaController = pessoaController;
    }

    public void exibirMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nMENU:");
                System.out.println("1. Listar Pessoas");
                System.out.println("2. Adicionar Pessoa");
                System.out.println("3. Atualizar Pessoa");
                System.out.println("4. Remover Pessoa");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                switch (opcao) {
                    case 1:
                        listarPessoas();
                        break;
                    case 2:
                        adicionarPessoa();
                        break;
                    case 3:
                        atualizarPessoa();
                        break;
                    case 4:
                        removerPessoa();
                        break;
                    case 5:
                    System.out.println();
                    System.out.println();
                    System.out.println("encerrando sistema e obrigado pela preferencia");
                    System.out.println();
                    System.out.println();
                    System.out.println("reiniciando sistema......");
                    System.out.println();

                    try {
                        Thread.sleep(5000); // Espera por 5 segundos (5000 milissegundos)
                        // Coloque aqui o código para reiniciar o sistema após 5 segundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                    break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }
    }

    private void listarPessoas() {
        List<Pessoa> pessoas = pessoaController.listarPessoas();
        System.out.println("\nLISTA DE PESSOAS:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getId() + ". " + pessoa.getNome() + " - IMC: " + pessoa.getImc());
        }
    }

    private void adicionarPessoa() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            // Preencha os demais atributos aqui

            Pessoa novaPessoa = new Pessoa();
            novaPessoa.setNome(nome);

            // Preencha os demais atributos da novaPessoa

            pessoaController.adicionarPessoa(novaPessoa);
        }

        System.out.println("Pessoa adicionada com sucesso.");
    }

    private void atualizarPessoa() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("ID da Pessoa a ser atualizada: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            Pessoa pessoaExistente = buscarPessoaPorId(id);

            if (pessoaExistente != null) {
                System.out.print("Novo Nome: ");
                String novoNome = scanner.nextLine();

                // Atualize os demais atributos aqui

                pessoaExistente.setNome(novoNome);

                // Atualize os demais atributos da pessoaExistente

                pessoaController.atualizarPessoa(pessoaExistente);
                System.out.println("Pessoa atualizada com sucesso.");
            } else {
                System.out.println("Pessoa não encontrada.");
            }
        }
    }

    private void removerPessoa() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("ID da Pessoa a ser removida: ");
            int id = scanner.nextInt();

            Pessoa pessoaExistente = buscarPessoaPorId(id);

            if (pessoaExistente != null) {
                pessoaController.removerPessoa(id);
                System.out.println("Pessoa removida com sucesso.");
            } else {
                System.out.println("Pessoa não encontrada.");
            }
        }
    }

    private Pessoa buscarPessoaPorId(int id) {
        List<Pessoa> pessoas = pessoaController.listarPessoas();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }
}
