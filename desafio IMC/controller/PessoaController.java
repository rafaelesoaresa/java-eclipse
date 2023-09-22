package controller;

import java.util.List;

import doa.PessoaDAO;
import model.Pessoa;

public class PessoaController {
    private PessoaDAO pessoaDAO;

    public PessoaController(PessoaDAO pessoaDAO) {
        this.pessoaDAO = pessoaDAO;
    }

    public List<Pessoa> listarPessoas() {
        return pessoaDAO.listarPessoas();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoaDAO.adicionarPessoa(pessoa);
    }

    public void atualizarPessoa(Pessoa pessoa) {
        pessoaDAO.atualizarPessoa(pessoa);
    }

    public void removerPessoa(int id) {
        pessoaDAO.removerPessoa(id);
    }
}
