package br.com.abc.introducao.A14_Polimorfismo.classes;

public class Gerente extends Funcionario{
    // Atributos
    private double plr;

    // Construtor
    public Gerente(String nome, double salario, double plr){
        super (nome, salario);
        this.plr = plr;
    }

    // Métodos
    @Override
    public  void calcularPagamento() {
        this.salario = this.salario + plr;
    }

    // Getters and Setters
    public double getPlr() {
        return plr;
    }

    public void setPlr(double plr) {
        this.plr = plr;
    }
}
