package br.com.abc.introducao.A6_ModificadoresStatic.classes;

public class Carro {
    // Velocidade limite deve ser de 240km/h
    private String nome;
    private double velocidadeMaxima;
    private static double getVelocidadeLimite = 240; // ao adicionar o static este atributo não pertence mais
                                                     // ao objeto e sim a classe carro.
// construtor
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
// e o construtor padrão
    public Carro() {
    }



// Metodo imprime

    public void imprimi(){
        System.out.println("=============================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + this.getVelocidadeLimite);
        System.out.println("=============================");

    }

// Getter and Setters
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

    public double getGetVelocidadeLimite() {
        return getVelocidadeLimite;
    }

    public void setGetVelocidadeLimite(double getVelocidadeLimite) {
        this.getVelocidadeLimite = getVelocidadeLimite;
    }
}
