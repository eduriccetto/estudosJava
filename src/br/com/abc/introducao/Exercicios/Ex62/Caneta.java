package br.com.abc.introducao.Exercicios.Ex62;

public class Caneta {

    public String marca;
    public String cor;
    public double preco;

    // Método
    @Override
    public String toString() {
        return "Caneta{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                '}';
    }

    // Construtores
    public Caneta() {
    }

    public Caneta(String marca, String cor, double preco) {
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
    }

    // Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
