package model;

public class Cliente {

	private int idcliente;
	private String nome;
	private String email;
	
	public Cliente(int idcliente, String nome, String email){
		this.idcliente = idcliente;
		this.nome = nome;
		this.email = email;
		
		
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nome=" + nome + ", email=" + email + "]";
	}

	

}