package view;

import model.Cliente;

public class Clienteview {
	public void exibirCliente(Cliente cliente) {
		System.out.println("====detalhe do cliente====");
		System.out.println("Cliente");
		System.out.println(cliente.getIdcliente());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getEmail());
		System.out.println("---------------------");
	}
}
