package Produto;

public class implementoProduto {

	
	public static void main(String[] args) {
		
		Produtos p1 = new Produtos("fone",99.9);
		
		System.out.println("Estoque atual ="+
		   p1.getQuantidadeStoque());
		
		p1.adicionarProdutos(2);
		p1.adicionarProdutos(3);
		
		System.out.println("estoque atual= "+
		p1.getQuantidadeStoque());
		  
	}
		private String Nome;
		private double Pre�o;
		private int QuantidadeStoque;
		
		
		public int getQuantidadeStoque() {
			return QuantidadeStoque;
		}
		public void adicionarprodutos(int Quantidade, int QuantidadeStoque) {
			this.QuantidadeStoque = QuantidadeStoque;
}
		public double getPre�o() {
			return Pre�o;
		}
		public void setPre�o(double pre�o) {
			Pre�o = pre�o;	

}
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			Nome = nome;
		}
}