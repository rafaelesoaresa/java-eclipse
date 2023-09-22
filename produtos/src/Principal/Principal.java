package Principal;

import java.util.Date;

import controller.ClienteController;
import controller.PedidoController;
import controller.ProdutoController;
import model.Cliente;
import model.Produto;

public class Principal {

	public static void main(String[] args) {

		Date data = new Date();

		// Cliente cliente = new Cliente(1, "rafael", "raf@email.com");
		ClienteController clienteController = new ClienteController();
		Cliente cliente = ClienteController.criarCliente(1, "rafael", "raf@email.com");
		clienteController.exibirDetalhes(cliente);

		// Produto produto = new Produto(1, "video game", 999.90);
		ProdutoController produtoController = new ProdutoController();
		Produto produto = ProdutoController.criarProduto(1, "video game", 999.90);
		produtoController.exibirDetalhes(produto);

		PedidoController pedidoController = new PedidoController();
		Pedido pedido = PedidoController.criarPedido(1, cliente, produto, 1, data);
		pedidoController.exibirdetalhesPedido(pedido);

	}

}
