package Produto;

public class Produtos {
private String Nome;
private String Pre�o;
private int QuantidadeStoque;

public Produtos(String Nome, String Pre�o, int QuantidadeStoque) {
	this.setNome(Nome);
	this.setPre�o(Pre�o);
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

public String getPre�o() {
	return Pre�o;
}

public void setPre�o(String pre�o) {
	Pre�o = pre�o;
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
