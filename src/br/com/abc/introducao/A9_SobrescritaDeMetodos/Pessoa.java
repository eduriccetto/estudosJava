package br.com.abc.introducao.A9_SobrescritaDeMetodos;

public class Pessoa {
    private String nome;
    private int idade;


    // Métodos
    @Override  // @override é uma anotação para outros devs de que este método foi sobrescrito
    public String toString(){
        return "Nome: " + nome +"\n"+ "Idade: " + idade;
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
}
