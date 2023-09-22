package Principal;

import java.util.Date;

import model.Cliente;
import model.Produto;

public class Pedido {
   private int idpedido;
   private Cliente cliente;
   private Produto produto;
   private int quantidade;
   private Date data;
   
  

public Pedido(int idpedido2, Cliente cliente2, Produto produto2, int quantidade2, Date data2) {
	// TODO Auto-generated constructor stub
}
public void pedido(int idpedido, int quantidade, Cliente cliente, Produto produto, Date data) {
   this.criarPedido(idpedido, quantidade,cliente,produto,data);
   }
   public void criarPedido(int idpedido, int quantidade, Cliente cliente, Produto produto, Date data) {
	   this.idpedido = idpedido;
	   this.cliente = cliente;
	   this.produto = produto;
	   this.quantidade = quantidade;
	   this.data = data;
   }
 
public int getIdpedido() {
	return idpedido;
}
public void setIdpedido(int idpedido) {
	this.idpedido = idpedido;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public Produto getProduto() {
	return produto;
}
public void setProduto(Produto produto) {
	this.produto = produto;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public void exibirpedido(Pedido pedido) {
	System.out.println("====detalhe do pedido====");
	System.out.println(pedido.getIdpedido());
	System.out.println(pedido.getCliente());
	System.out.println(pedido.getProduto());
	System.out.println(pedido.getQuantidade());
	System.out.println(pedido.getData());
	System.out.println("---------------------");
	
}
@Override
public String toString() {
	return "Pedido [idpedido=" + idpedido + ", cliente=" + cliente + ", produto=" + produto + ", quantidade="
			+ quantidade + ", data=" + data + "]";
}

}

	



   

