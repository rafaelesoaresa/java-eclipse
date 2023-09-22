package view;


import model.Produto;

public class ProdutoView {
	public static void exibirProduto(Produto produto) {
		System.out.println("====detalhe do produto====");
		System.out.println(produto.getIdproduto());
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
		System.out.println("---------------------");
	}
}
