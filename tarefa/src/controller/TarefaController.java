package controller;

import java.util.ArrayList;
import java.util.List;

import model.Tarefa;
import view.TarefaView;

public class TarefaController {
	private List<Tarefa> listaDeTarefa;
	private TarefaView tarefaView;

	public TarefaController() {
		listaDeTarefa = new ArrayList<>();
		tarefaView = new TarefaView();
	}

	public void adicionarTarefa(Tarefa tarefa, String status) {
		Tarefa Tarefa = new Tarefa(tarefa, status);
		listaDeTarefa.add(tarefa);

	}

	public void removerPais(String nome) {
		for (Tarefa tarefa : listaDeTarefa) {
			if (tarefa.getStatus().equalsIgnoreCase(nome)) {
				listaDeTarefa.remove(tarefa);
				break;
			}
		}
	}

	public void ExibirListaTarefa() {

		TarefaView.ExibirDetalhesDeTarefa(listaDeTarefa);

	}
}
