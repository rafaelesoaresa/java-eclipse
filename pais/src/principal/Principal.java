package principal;



import java.util.Scanner;

import controller.PaisController;

public class Principal {

	public static void main(String[] args) {
		PaisController paisController = new PaisController();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 0) {
			System.out.println("====== Menu ==========");
			System.out.println("1 Adicionar pais");
			System.out.println("2 Exibir lista de paises");
			System.out.println("3 Remover pais da lista");
			System.out.println("4 limpar lista ");
			System.out.println("0 sair");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do pais: ");
				 scanner.nextLine(); // Consumir o '\n' apõs a leitura do numero
				String nome = scanner.nextLine();

				System.out.println("Digite a capital do pais " + nome + ": ");
				 String capital = scanner.nextLine();

				paisController.adicionarPais(nome, capital);
				;
				break;

			case 2:
				paisController.exibirListaDePaises();
				break;

			case 3:
				System.out.println("insira o pais a ser removido:");
				scanner.nextLine();
				String nomePais = scanner.nextLine();
				paisController.removerPais(nomePais);
				break;
			case 4:
				
				
			case 0:
				System.out.println("Saindo....");
				break;

			default:
				System.out.println("opção ivalida");
				break;

			}
		}
	}
}
