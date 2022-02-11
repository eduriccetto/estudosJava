package br.com.abc.introducao.Exercicios.Ex15;

import br.com.abc.introducao.Exercicios.Ex15.AprovacaoDeAluno;

public class Aluno {
    private final String nome;

    //Método
    @Override
    public String toString() {
        return nome;
    }

    //Construtor
    public Aluno(String nome) {
        this.nome = nome;
    }

    //Getters and Detters
    public String getNome() {
        return nome;
    }

}
