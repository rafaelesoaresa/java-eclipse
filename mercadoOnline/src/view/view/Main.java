package view;

import java.util.List;

import model.Produto;
import produtoDoa.A.O.ProdutoDOA;

public class Main {
 public static void main(String[] args) {
     ProdutoDOA produtoDAO = new ProdutoDOA();

     // Adicionar produtos
     Produto produto1 = new Produto("Produto 1", 10.0);
     Produto produto2 = new Produto("Produto 2", 20.0);
     produtoDAO.adicionarProduto(produto1);
     produtoDAO.adicionarProduto(produto2);

     // Listar produtos
     List<Produto> produtos = produtoDAO.listarProdutos();
     System.out.println("Lista de Produtos:");
     for (Produto produto : produtos) {
         System.out.println("Produto: " + produto.getNome() + ", Pre�o de Venda: " + produto.getPrecoVenda());
     }

     // Buscar produto por nome
     String nomeProduto = "Produto 1";
     Produto produtoEncontrado = produtoDAO.buscarProdutoPorNome(nomeProduto);
     if (produtoEncontrado != null) {
         System.out.println("Produto encontrado: " + produtoEncontrado.getNome());
     } else {
         System.out.println("Produto com o nome '" + nomeProduto + "' n�o encontrado.");
     }

     // Remover produto
     String nomeProdutoRemover = "Produto 2";
     produtoDAO.removerProduto(nomeProdutoRemover);
     System.out.println("Produto '" + nomeProdutoRemover + "' removido.");

     // Listar produtos atualizados
     produtos = produtoDAO.listarProdutos();
     System.out.println("Lista de Produtos Atualizada:");
     for (Produto produto : produtos) {
         System.out.println("Produto: " + produto.getNome() + ", Pre�o de Venda: " + produto.getPrecoVenda());
     }
 }
}
