package view;

import java.util.List;

import model.Pais;

public class PaisView {
    public void exibirListaDePaises(List<Pais> paises) {
    	// Exibe no console uma mensagem para simbolizar o topo da lista de países
        System.out.println("==== Lista de Países ====");
        System.out.println("--------------------");
        
        /*
         * Esse modelo de "for" é conhecido como foreach. Em java utilizamos apenas como "for"
         * Esse "for" é usado para percorrer uma coleção de objetos, que nesse exemplo, são do tipo "Pais"
         * 
         * for (Pais pais : paises) {: Aqui, paises é uma coleção (por exemplo, uma lista, um array ou um conjunto) que contém objetos do tipo Pais. 
         * O loop for-each é usado para iterar por essa coleção. Ele pode ser lido como "para cada Pais chamado pais dentro de paises, faça o seguinte".
         * System.out.println("País: " + pais.getNome() + " - Capital: " + pais.getCapital());: Dentro do loop, o código imprime informações sobre cada 
         * objeto Pais. A expressão pais.getNome() retorna o nome do país, e pais.getCapital() retorna a capital do país. Essas informações são 
         * concatenadas com strings adicionais para formar uma mensagem de saída, que será impressa no console.
         */
        for (Pais pais : paises) {
            System.out.println("País: " + pais.getNome() + 
            				   " - Capital: " + pais.getCapital());
        }
        
        System.out.println("--------------------");
    }
    
    /*
     * Método exibe uma mensagem ao usuário para informar se o país foi removido.
     * Recebe um parametro paisRemovido do tipo booleano (verdadeiro ou falso)
     */
    public void removerPais(boolean paisRemovido) {
    	// Condicional que verifica se paisRemovido é igual a true
        if (paisRemovido) {
        	System.out.println("País removido com sucesso!\n");
        } else {
        	System.out.println("País não encontrado na lista.\n");
        }
    }
    
    /*
     * Método exibe uma mensagem ao usuário para informar que a lista de países foi limpa
     */
    public void limparListaDePaises() {
        System.out.println("Lista de países foi limpa!\n");
    }
    
    /*
     * Método exibe as informações referentes a um país, para isso, o método
     * espera receber um país como parametro
     */
    public void exibirPais(Pais pais) {
    	System.out.println("País: " + pais.getNome() + 
				   		   " - Capital: " + pais.getCapital());
    }
    
    /*
     * Exibe uma mensagem recebida atráves do parametro msg no console
     */
    public void exibirMensagem(String msg) {
    	System.out.println(msg);
    }
}
