package doa;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;
//main na ultilização do array List
public class PessoaDAO {
    private List<Pessoa> pessoas;

    public PessoaDAO() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> obterTodasAsPessoas() {
        return pessoas;
    }
    //
}
