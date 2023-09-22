package pessoa;

public class implementoPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		Pessoa.setNome("rafael");
		Pessoa.setIdade("19");
		
		System.out.println(Pessoa.getNome());
		System.out.println(Pessoa.getIdade());
		

	}

}
