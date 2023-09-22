package Produto;

public class Produtos {
private String Nome;
private String Preço;
private int QuantidadeStoque;

public Produtos(String Nome, String Preço, int QuantidadeStoque) {
	this.setNome(Nome);
	this.setPreço(Preço);
	this.setQuantidadeStoque(QuantidadeStoque);
}

public Produtos(String string, double d) {
	
}

public String getNome() {
	return Nome;
}

public void setNome(String nome) {
	Nome = nome;
}

public String getPreço() {
	return Preço;
}

public void setPreço(String preço) {
	Preço = preço;
}

public int getQuantidadeStoque() {
	return QuantidadeStoque;
}

public void setQuantidadeStoque(int quantidadeStoque) {
	QuantidadeStoque = quantidadeStoque;
}

public void adicionarProdutos(int i) {
	// TODO Auto-generated method stub
	
}
}
