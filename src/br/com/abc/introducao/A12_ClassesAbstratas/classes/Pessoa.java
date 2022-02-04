package br.com.abc.introducao.A12_ClassesAbstratas.classes;
// Classes abstratas podem extender outras classes abstratas

public abstract class Pessoa {
    protected String nome;

    // Método
    public abstract void imprimi();

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
