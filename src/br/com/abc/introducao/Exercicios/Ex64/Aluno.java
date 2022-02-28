package br.com.abc.introducao.Exercicios.Ex64;

public class Aluno {

    // Atributos
    private String nome;
    private int idade;
    private String turma;
    private double nota;


    // Métodos
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", turma='" + turma + '\'' +
                ", nota=" + nota +
                '}';
    }

    // Construtores
    public Aluno() {
    }

    public Aluno(String nome, int idade, String turma, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
        this.nota = nota;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
