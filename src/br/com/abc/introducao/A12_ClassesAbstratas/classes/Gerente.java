package br.com.abc.introducao.A12_ClassesAbstratas.classes;

public class Gerente extends Funcionario{
    // Construtor
    public Gerente() {

    }
    public Gerente (String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    // Métodos
    @Override
    public void imprimi() {
        System.out.println("dentro do médoto imprimi");
    }

    @Override
    public void calculaSalario(){
        this.salario = salario + (salario * 0.2);
    }
}
