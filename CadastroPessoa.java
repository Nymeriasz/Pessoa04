package Pessoa04;

import java.util.ArrayList;

public class CadastroPessoa {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private int quantAtual;

    public void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public void mostrarCadastro(){
        for (Pessoa pessoa:pessoas) {
            System.out.println(pessoa);
        }
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public int getQuantAtual() {
        return quantAtual;
    }

    public void setQuantAtual(int quantAtual) {
        this.quantAtual = quantAtual;
    }
}
