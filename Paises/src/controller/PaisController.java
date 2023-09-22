package controller;

import dao.PaisDAO;
import exception.MenosDeQuatroItensException;
import model.Pais;
import view.PaisView;

import java.util.List;
import java.util.NoSuchElementException;

public class PaisController {
	/* 
	 * A classe de controle fica na camada intermediaria do sistema, sendo responsavel
	 * por ser o maestro do sistema, pois "conversa" diretamente com as demais camadas
	 * do Padrão de Desenvolvimento MVC e DAO. Em outras palavras, a classe controller
	 * fica entre as camadas Model, View e DAO. Sendo assim, para  poder  executar  as
	 * requisiões recebidas, precisamos ter acesso a camada de dados e a camada  view.
	 */
	
	// Atributo paisDAO (camada de dados)
    private PaisDAO paisDAO;
    
    // Atributo paisView (camada de interação com o usuário)
    private PaisView paisView;

    // Método construtor
    public PaisController() {
        paisDAO = new PaisDAO();
        paisView = new PaisView();
    }

    /*
     * Método adiciona país a uma lista presente na camada de dados
     */
    public void adicionarPais(String nome, String capital) {
    	// Cria um objeto do tipo Pais (model)
        Pais pais = new Pais(nome, capital);
        
        // Utiliza o método adiciona pais da classe de dados, passando o objeto pais como parametro
        paisDAO.adicionarPais(pais);
    }

    /*
     * Método exibe a lista de países cadastrados no sistema
     */
    public void exibirListaDePaises() {
    	// Criação do lista de países que recebe a lista de países contida na classe de dados, atráves do método obterListaDePaises
        List<Pais> listaDePaises = paisDAO.obterListaDePaises();
        
        // Exibe a lista de países utilizando o método da view exibirListaDePaises, passando como parametro a lista de países
        paisView.exibirListaDePaises(listaDePaises);
    }

    /*
     * Método que remove país da lista de países, para isso, recebemos como parametro o nome do país que será removido da lista.
     */
    public void removerPais(String nomePaisRemover) {
    	// Criação de uma variável do tipo boolean (true/false) para servir como variável de controle que guardará
    	// a informação se o país foi removido, sim ou não
    	boolean paisRemovido = false;

    	/*
    	 * For diferente, conhecido como foreach. Onde utilizamos um array/vetor/lista como base.
    	 * Com isso, o for reconhece o array e já consegue usar o tamanho do array como condifional
    	 * para dar as voltas (loops). Esse for (foreach) é melhor explicado na classe PaisView.
    	 */
        for (Pais pais : paisDAO.obterListaDePaises()) {
        	
        	/*
        	 * Condicional que verifica se o atributo nome do país da lista, é igual ao país que o usuário
        	 * deseja excluir. O método equalsIgnoreCase ignora a case sensibilidade, em  outras palavras,
        	 * o sistema ignora as letras maiúsculas e minúsculas. 
        	 */
            if (pais.getNome().equalsIgnoreCase(nomePaisRemover)) {
            	/*
            	 * Ao achar na lista o país que será deletado, invocamos o método removerPais da camada de
            	 * dados e passamos como parametro o país que será deletado.
            	 */
            	paisDAO.removerPais(pais);
            	
            	// Atualizamos nossa variável booleana com true, pois removemos o país da lista
            	paisRemovido = true;
            	
            	// Ao remover o país da lista, utilizamos o break para frear as voltas do for (foreach)
                break;
            }
        }
        
        /*
         * Utilizamos da camada view o método removerPais para exibir uma mensagem ao usuário com informação
         * se o país foi removido sim ou não, para isso, passamos como parametro a variável de  controle  de
         * exclusão, nossa variável paisRemovido
         */
        paisView.removerPais(paisRemovido);
    }

    /*
     * Método que limpa a lista de países
     */
    public void limparListaDePaises() {
    	// Para limpar a lista de países, utilizamos o método limparListaDePaises da classa da camada de dados
        paisDAO.limparListaDePaises();
        paisView.limparListaDePaises();
    }
    public void testarConexao(){
    	paisDAO.testarConexao();
    	
    	
    }

    /*
     * Método que retorna o primeiro país da lista de paises
     */
    public void primeiro() {
    	/*
    	 * Estrutura try-catch. Estrutura utilizada para possiveis excecões que possam acontecer.
    	 * O trecho de código que pode lançar uma exceção (erro) fica no bloco try.
    	 * Se o bloco try emitir uma exceção, automaticamente a excução do bloco try para, e o bloco
    	 * catch é chamado e executado.
    	 */
        try {
        	/*
        	 * Criação de um objeto pais que recebe o primeiro pais da lista, através do método
        	 * obterPrimeiroPais do objeto paisDAO (camada de dados).
        	 */
            Pais primeiroPais = paisDAO.obterPrimeiroPais();
            
            /*
             * Verifica se a variável pais recebeu, de fato um país. Nesse momento, o sistema pode
             * lançar um erro, pois seria possível a lista estar vazia, consequentemente, não teria
             * um primeiro país para retornar.
             */
            if (primeiroPais == null) {
            	// Lança uma exceção informando que a lista está vazia.
                throw new NoSuchElementException("A lista está vazia. Não é possível pegar o primeiro elemento.");
            }
            
            // Exibe o país utilizando o método exibirPais do objeto paisView
            paisView.exibirPais(primeiroPais);
        } 
        
        /*
         * Trecho catch da estrutura try-catch
         * Esse trecho de código, é utilizado se alguma linha do trecho try lançar uma exceção (erro).
         */
        catch (NoSuchElementException e) {
        	// Exibe o mensagem da exceção (erro)
        	paisView.exibirMensagem(e.getMessage());
        }
    }

    /*
     * Métodos terceiro e quarto estão estruturados da mesma maneira que o método primeiro
     */
    public void terceiro() {
        try {
            Pais terceiroPais = paisDAO.obterTerceiroPais();
            if (terceiroPais == null) {
                throw new NoSuchElementException("A lista não contém pelo menos 3 elementos.");
            }
            paisView.exibirPais(terceiroPais);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    public void quarto() {
        try {
            Pais quartoPais = paisDAO.obterQuartoPais();
            if (quartoPais == null) {
                throw new MenosDeQuatroItensException("A lista não contém pelo menos 4 elementos.");
            }
            paisView.exibirPais(quartoPais);
        } catch (MenosDeQuatroItensException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

	public void testaConexao() {
		// TODO Auto-generated method stub
		
	}

	
}