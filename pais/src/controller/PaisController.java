package controller;

import java.util.ArrayList;
import java.util.List;

import principal.Pais;
import view.PaisView;

public class PaisController {
	private List<Pais> ListaDePaises;
	private PaisView paisView;

	public PaisController() {
		ListaDePaises = new ArrayList<>();
		paisView = new PaisView();

	}

	public void adicionarPais(String nome, String capital) {
		Pais pais = new Pais(nome, capital);
		ListaDePaises.add(pais);

	}

	public void removerPais(String nome) {
		for (Pais pais : ListaDePaises) {
			if (pais.getNome().equalsIgnoreCase(nome)) {
				ListaDePaises.remove(pais);
				break;
			}

		}
	}

	public void limpar

	public void exibirListaDePaises() {
		paisView.exibirDetalhesDePais(ListaDePaises);
	}

}
