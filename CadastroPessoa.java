package Pessoa04;

import java.util.ArrayList;

public class CadastroPessoa {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void mostrarCadastro(){
        for (Pessoa pessoa : pessoas) {
            pessoa.mostrarDados();
        }
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}