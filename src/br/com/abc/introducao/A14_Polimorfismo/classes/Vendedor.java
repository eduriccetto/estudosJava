package br.com.abc.introducao.A14_Polimorfismo.classes;

public class Vendedor extends Funcionario{
    // Atributos
    private double totalVendas;

    // Construtor
    public Vendedor(String nome, double salario, double totalVendas) {
        super (nome, salario);
        this.totalVendas = totalVendas;
    }

    // Método
    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (totalVendas * 0.05);
    }

    // Getters and Setters
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
