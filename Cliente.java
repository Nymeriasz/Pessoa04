package Pessoa04;

public class Cliente extends Pessoa{
    private int codigo;

    public Cliente(String nome, String cpf, int codigo) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Cliente: " + nome + ", CPF: " + cpf + ", Código: " + codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
