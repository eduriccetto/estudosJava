package br.com.abc.introducao.A10_ModificadorFinal.classe;

public class Carro {
    public static final double VELOCIDADE_FINAL;
    private String nome;
    private String marca;

    static {
        VELOCIDADE_FINAL = 200;
    }

    // Métodos
    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
