package view;

import java.util.List;

import principal.Pais;

public class PaisView {
	public void exibirDetalhesDePais(List<Pais> paises) {
		System.out.println("====== Lista de paises ======");
		System.out.println("----------------------");

		for (Pais pais : paises) {
			System.out.println("Pais: " + pais.getNome());

		}
		System.out.println("--------------");
	}

}
