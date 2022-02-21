package br.com.abc.introducao.Exercicios.Ex63;

public class Caneta {

    private String marca;
    private String cor;
    private double preco;

    // Métodos
    @Override
    public String toString() {
        return "==============================="+"\n"+
                "CANETA" + "\n"+
                "Marca: " + marca + "\n" +
                "Cor: " + cor + "\n" +
                "Preco: " + preco ;
    }

    public static String Cadastrar(String Marca, String Cor, double Preco){

        Caneta x = new Caneta();
        x.setMarca(Marca);
        x.setCor(Cor);
        x.setPreco(Preco);

        return "============================="+
                "Caneta cadastrada: " +
                "Marca: " + x.getMarca()+
                "Cor: " + x.getCor()+
                "Preço: R$" + x.getPreco()+
                "============================";
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
