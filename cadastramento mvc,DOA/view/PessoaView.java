package view;

import java.util.List;
import java.util.Scanner;

import doa.PessoaDAO;
import model.Pessoa;

public class PessoaView {
    private Scanner scanner = new Scanner(System.in);
    private PessoaDAO pessoaDAO;

    public PessoaView(PessoaDAO pessoaDAO) {
        this.pessoaDAO = pessoaDAO;
    }

    // menu principal
    public void iniciar() {
        while (true) {
            System.out.println("....... person book......");
            System.out.println("......... MENU:...........");
            System.out.println("1. Adicionar Pessoa");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Sair");
            System.out.print("  Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (escolha) {
                case 1:
                    adicionarPessoa();
                    break;
                case 2:
                    listarPessoas();
                    break;
                case 3:
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
                    System.out.println();
                    System.out.println("!!!!escolha inexistente por favor colocar uma escolha existente!!!!");
                    System.out.println();
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

            }
        }
        
    }
    //

    // menu da opção 1
    private void adicionarPessoa() {
        System.out.println("Adicionar Pessoa:");
        System.out.print("..Nome>: ");
        String nome = scanner.nextLine();
        System.out.print("..Sexo>: ");
        String sexo = scanner.nextLine();
        System.out.print("..Altura>: ");
        double altura = scanner.nextDouble();
        System.out.print("..Idade>: ");
        int idade = scanner.nextInt();
        System.out.print("..Peso>: ");
        double peso = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(sexo, sexo, peso, idade, peso);
        pessoa.setNome(nome);
        pessoa.setSexo(sexo);
        pessoa.setAltura(altura);
        pessoa.setIdade(idade);
        pessoa.setPeso(peso);

        pessoaDAO.adicionarPessoa(pessoa);
        System.out.println("..!!!Pessoa adicionada com sucesso!!!..");

    }
    //
    
    // mençagem da opção 2
    private void listarPessoas() {
        List<Pessoa> pessoas = pessoaDAO.obterTodasAsPessoas();
        if (pessoas.isEmpty()) {
            System.out.println("..Nenhuma pessoa cadastrada :( ");
            System.out.println(".");
            System.out.println(".");

        } else {
            System.out.println("... pesquisar pessoa...:");
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa.getNome() + " - " + pessoa.getIdade() + " anos");
            }
        }
    }
}
//