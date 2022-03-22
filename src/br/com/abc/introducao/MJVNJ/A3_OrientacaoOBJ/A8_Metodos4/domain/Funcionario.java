package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.domain;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salario = new double[3];

    public void imprimeFuncionario(){
        System.out.println("\n---------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Salario 1: "+this.salario[0]);
        System.out.println("Salario 2: "+this.salario[1]);
        System.out.println("Salario 3: "+this.salario[2]);
    }

    public void mediaSalario(){
        System.out.println("------------------------");
        double soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += salario[i];
        }
        System.out.println("A media dos salários de "+nome+" é "+(soma/3));
    }

}
