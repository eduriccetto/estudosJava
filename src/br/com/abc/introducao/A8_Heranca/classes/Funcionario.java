package br.com.abc.introducao.A8_Heranca.classes;
// aqui por tanto funcionário "é" uma Pessoa
public class Funcionario extends Pessoa {
//    private String nome;      com o "extends Pessoa dizemos que esta classe é uma extensão de Pessoa
//    private String cpf;       portando não precisa declarar estes atributos iguais.
//    private Endereço endereço;
    private double salario;

    // Método                  pode ser erdado até p metodo print de Pessoa (não precisava ter feito aqui)
    public void print(){
//        System.out.println("Nome: " + this.getNome());
//        System.out.println("CPF: " + this.getCpf());
//        System.out.println("Endereço: " + this.getEndereço().getRua());
        super.print();           // este "super" substitiu o parametros acima que já vem de herança de outra classe
        System.out.println("Salario: " + this.salario);
    }

    public void imprimeReciboDePagamento(){
        System.out.println("Eu " + super.nome + " recebi meu salário no valor de R$" + this.salario);
    }                          // aqui podemos acessar o super.nome por estar como protected ao inves de private
    // Getters and Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
