package doa;

import java.util.List;

import model.Pessoa;

public interface PessoaDAO {
    List<Pessoa> listarPessoas();
    void adicionarPessoa(Pessoa pessoa);
    void atualizarPessoa(Pessoa pessoa);
    void removerPessoa(int id);
}
