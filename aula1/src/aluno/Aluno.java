package aluno;

public class Aluno {
	private String Nome;
	private String Sobrenome;
	private int Matricula;
	
	public Aluno( String Nome, String Sobrenome, int Matricula) {
		this.setNome(Nome);
		this.setSobrenome(Sobrenome);
		this.setMatricula(Matricula);

}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
}