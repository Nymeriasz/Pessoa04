package Pessoa04;

public class Main {
    public static void main(String[] args) {
        CadastroPessoa cp = new CadastroPessoa();

        Cliente cliente = new Cliente("Pamella", "000099", 1234);
        cp.cadastrarPessoa(cliente);

        Funcionario funcionario = new Funcionario("Maria", "111222", "12345", 3000.0);
        cp.cadastrarPessoa(funcionario);

        Gerente gerente = new Gerente("Maia", "333444", 1);
        cp.cadastrarPessoa(gerente);

        cp.mostrarCadastro();
    }
}
