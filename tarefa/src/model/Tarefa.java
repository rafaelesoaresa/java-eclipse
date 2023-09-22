package model;

public class Tarefa {
	String tarefa;
	String status;

	public Tarefa(String tarefa, String status) {
		this.tarefa = tarefa;
		this.status = status;

	}

	public Tarefa(Tarefa tarefa1, String status2) {
		// TODO Auto-generated constructor stub
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
