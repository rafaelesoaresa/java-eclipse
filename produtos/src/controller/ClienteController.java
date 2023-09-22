package controller;

import model.Cliente;
import view.Clienteview;

public class ClienteController {

	private Clienteview clienteView;
	
	public ClienteController() {
		clienteView = new Clienteview();
	}
	public static  Cliente criarCliente(int idcliente,String nome,String email) {
	 Cliente cliente = new Cliente (idcliente,nome,email); 
			return cliente;
	}
	public void exibirDetalhes(Cliente cliente) {
		clienteView.exibirCliente(cliente);
	}
}
