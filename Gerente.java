package Pessoa04;

public class Gerente extends Pessoa {
    private int area;

    public Gerente(String nome, String cpf, int area) {
        super(nome, cpf);
        this.area = area;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Gerente: " + nome + ", CPF: " + cpf + ", Área: " + area);
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
