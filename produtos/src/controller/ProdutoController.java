package controller;



import model.Produto;
import view.ProdutoView;

public class ProdutoController {
	
	private ProdutoView produtoView;
	
	public ProdutoController() {
		produtoView = new ProdutoView();
	}
	public static Produto criarProduto(int idproduto,String nome,double preco) {
		Produto produto = new Produto (idproduto,nome,preco);
		return produto;
	}
	public void exibirDetalhes(Produto produto) {
		ProdutoView.exibirProduto(produto);
	}

}
