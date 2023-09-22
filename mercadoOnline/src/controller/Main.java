package controller;

import java.util.List;

import model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto 1", 10.0);
        Produto produto2 = new Produto("Produto 2", 20.0);

        produtoDoa.A.O.ProdutoDOA produtoDAO = new produtoDoa.A.O.ProdutoDOA();
        produtoDAO.adicionarProduto(produto1);
        produtoDAO.adicionarProduto(produto2);

        List<Produto> produtos = produtoDAO.listarProdutos();
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Preço de Venda: " + produto.getPrecoVenda());
        }

        String nomeProduto = "Produto 1";
        Produto produtoEncontrado = produtoDAO.buscarProdutoPorNome(nomeProduto);
        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado.getNome());
        } else {
            System.out.println("Produto com o nome '" + nomeProduto + "' não encontrado.");
        }

        String nomeProdutoRemover = "Produto 2";
        produtoDAO.removerProduto(nomeProdutoRemover);
        System.out.println("Produto '" + nomeProdutoRemover + "' removido.");

        produtos = produtoDAO.listarProdutos();
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Preço de Venda: " + produto.getPrecoVenda());
        }
    }
}
