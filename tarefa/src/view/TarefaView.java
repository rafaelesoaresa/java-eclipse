package view;

import java.util.List;

import model.Tarefa;

public class TarefaView {

	public static void ExibirDetalhesDeTarefa(List<Tarefa>tarefas) {
		System.out.println("======= lista de tarefa ========");
		System.out.println("---------------------------------");
		
		for (Tarefa tarefa : tarefas) {
			System.out.println("tarefa: " + tarefa.getTarefa());

		}
		System.out.println("--------------");
	}

}
