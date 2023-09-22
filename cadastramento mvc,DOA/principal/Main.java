package principal;

import doa.PessoaDAO;
import view.PessoaView;

public class Main {
    //main
    public static void main(String[] args) {
        PessoaDAO pessoaDAO = new PessoaDAO();
        PessoaView pessoaView = new PessoaView(pessoaDAO);
        pessoaView.iniciar();
    }
    //
}
