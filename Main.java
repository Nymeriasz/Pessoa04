package Pessoa04;

public class Main {
    public static void main(String[] args) {
        CadastroPessoa cp = new CadastroPessoa();
        Pessoa p1 = new Pessoa();
        p1.setNome("Pamella");
        p1.setCpf("000099");
        p1.mostrarDados();
        cp.cadastrarPessoa(p1);
        cp.mostrarCadastro();
    }
}
