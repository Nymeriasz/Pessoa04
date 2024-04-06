package Pessoa04;

public class Gerente extends Funcionario{
    private int area;
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println(area);
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
