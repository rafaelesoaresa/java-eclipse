package controller;

import java.util.Date;
import model.Cliente;
import model.Produto;
import view.PedidoView;
import Principal.Pedido;

public class PedidoController {

	private PedidoView pedidoView;

	public PedidoController() {
		pedidoView = new view.PedidoView();
	}

	public static Pedido criarPedido(int idpedido, Cliente cliente, Produto produto, int quantidade, Date data) {
		Pedido pedido = new Pedido(idpedido, cliente, produto, quantidade, data);
		return pedido;
	}

	public void exibirdetalhesPedido(Pedido pedido) {
		pedidoView.exibirpedido(pedido);
	}

}
