package main;



import java.util.ArrayList;
import java.util.List;

import doa.PessoaDAO;
import model.Pessoa;

public class PessoaDAOMemoria implements PessoaDAO {
    private List<Pessoa> pessoas = new ArrayList<>();
    private int proximoId = 1;

    @Override
    public List<Pessoa> listarPessoas() {
        return pessoas;
    }

    @Override
    public void adicionarPessoa(Pessoa pessoa) {
        pessoa.setId(proximoId++);
        pessoa.calcularIMC();
        pessoas.add(pessoa);
    }

    @Override
    public void atualizarPessoa(Pessoa pessoa) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId() == pessoa.getId()) {
                pessoas.set(i, pessoa);
                pessoa.calcularIMC();
                return;
            }
        }
    }

    @Override
    public void removerPessoa(int id) {
        pessoas.removeIf(pessoa -> pessoa.getId() == id);
    }
}
