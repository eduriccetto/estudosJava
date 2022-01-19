package br.com.abc.introducao.javaCore.introducao.Classes;

public class Professor {
    private String nome;
    private int idade;
    private String materia;
    private boolean aposentado;

    public void print(){
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("materia: " + this.materia);
        this.aposentado = idade > 70;
        System.out.println("aposentado: " + this.aposentado);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {         //  set utilizamos para setar o valor
        this.idade = idade;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public void setAposentado(boolean aposentado){
        this.aposentado = aposentado;
    }
                                             // get utilizamos para buscar o valor
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getMateria(){
        return this.materia;
    }
    public boolean Aposentado(){
        return this.aposentado;
    }
}


