package pessoa;

public class Pessoa {
	private static String Nome;
	private static int Idade;
		
public Pessoa() { 
	Pessoa.setNome(Nome);
	this.setIdade(Idade);
}

public static String getNome() {
	return Nome;
}

public static void setNome(String nome) {
	
}

public static int getIdade() {
	return Idade;
}

public void setIdade(int idade2) {
	Idade = idade2;
}

public static void setIdade(String string) {
	// TODO Auto-generated method stub
	
}

	}

