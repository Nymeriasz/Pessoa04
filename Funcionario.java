package Pessoa04;

public class Funcionario extends Pessoa{
    private String matricula;
    private double salario;

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println(matricula+", "+salario);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
