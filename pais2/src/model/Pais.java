package model;

/*
 * Classe Pais
 * Essa classe é nossa entidade, ou classe de modelo. Ela faz referencia a algo do mundo real.
 */
public class Pais {
	// Atributos da classe Pais
    private String nome;
    private String capital;

    // Método construtor da classe Pais
    public Pais(String nome, String capital) {
    	/*
    	 * O construtor da classe Pais recebe como parametro 2 atributos do tipo String, que são:
    	 * nome e capital. Para atribuir esses parametros aos atributos da classe Pais, precisamos
    	 * acessar os atributos da classe. Para fazer isso, usamos a palavra reservada "this", que 
    	 * faz referência a classe.
    	 * Em outras palavras: quando você está dentro de um método, você consegue apenas acessar
    	 * as variáveis de dentro do método (de dentro do mesmo escopo). Para conseguir acessar os
    	 * atributos da classe (nome e capital) que estão em outro escopo, utilizamos a palavra this
    	 * para acessar o escopo da classe.
    	 */
        this.nome = nome;
        this.capital = capital;
    }

    // Método getNome retorna o atributo nome que é do tipo String
    public String getNome() {
        return nome;
    }

    // Método setNome atribui o nome que vem por paramêtro ao atributo nome da classe Pais
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getNome retorna o atributo capital que é do tipo String
	public String getCapital() {
		return capital;
	}

	// Método setCapital atribui a capital que vem por paramêtro ao atributo capital da classe Pais
	public void setCapital(String capital) {
		this.capital = capital;
	}
}
