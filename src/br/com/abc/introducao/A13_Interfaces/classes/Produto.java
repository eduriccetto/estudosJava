package br.com.abc.introducao.A13_Interfaces.classes;
// Podemos considerar a Interface como um contrato que diz o que uma classe deve fazer, mas não como...
// Uma interface é implementada (implements) ao invez de extendida (extends)
// E pode ser implementada mais de uma
public class Produto implements Tributavel, Transportavel {
    // Atributos
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    // Métodos
    @Override          // A interfaça diz o que se deve fazer, mas não como, pq é aqui na classe que dizemos o
    public void calcularImposto() {  // método de como fazer.
        precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / peso * 0.1;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal=" + precoFinal +
                ", valorFrete=" + valorFrete + "\n" + "\n" +
                ", Preço final com imposto e frete de : " + (valorFrete + precoFinal) +
                '}';
    }

    // Construtores
    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    // Getters and Setters
    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
