package Pessoa04;

public class Cliente extends Pessoa{
    private int codigo;

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println(codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
