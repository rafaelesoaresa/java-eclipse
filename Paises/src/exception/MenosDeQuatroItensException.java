package exception;

/*
 * Classe MenosDeQuatroItensException
 * Essa classe só é considerada uma classe de exception, porque ela tem herança
 * da classe RuntimeException
 */
public class MenosDeQuatroItensException extends RuntimeException {
	
	// Método construtor
	public MenosDeQuatroItensException(String mensagem) {
		// Método para acessar o construtor da super classe
        super("CLASSE: " + mensagem);
    }
}
