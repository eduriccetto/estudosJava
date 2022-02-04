package br.com.abc.introducao.A12_ClassesAbstratas.classes;

public class Vendedor extends Funcionario{
    private double totalVendas;

    // Métodos
    @Override
    public void imprimi() {
        System.out.println("dentro do médoto imprimi");
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas * 0.05);
    }

    // Construtores
    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    //  Getters and Setters
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
