package model;

public class Produto {
	private int idproduto;
	private String nome;
	private double preco;
	
	
	
	
	public Produto(int idproduto, String nome, double preco) {
		this.idproduto = idproduto;
		this.nome = nome;
		this.preco = preco;
		
	}

	
	public int getIdproduto() {
		return idproduto;
	}


	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "produto [idproduto=" + idproduto + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
}
