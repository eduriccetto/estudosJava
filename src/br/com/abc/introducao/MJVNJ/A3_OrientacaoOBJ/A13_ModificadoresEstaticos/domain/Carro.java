package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A13_ModificadoresEstaticos.domain;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    // Construtor
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Metodo
    public void imprime() {
        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);
    }

    // Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
