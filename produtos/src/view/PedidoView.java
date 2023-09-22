package view;

import Principal.Pedido;

public class PedidoView {
	public void exibirpedido(Pedido pedido) {
		System.out.println("====detalhe do pedido====");
		System.out.println(pedido.getIdpedido());
		System.out.println(pedido.getQuantidade());
		System.out.println(pedido.getCliente());
		System.out.println(pedido.getProduto());
		System.out.println(pedido.getData());
		System.out.println("---------------------");
	}
}
