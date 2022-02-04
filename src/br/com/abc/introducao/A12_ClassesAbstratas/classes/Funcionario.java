package br.com.abc.introducao.A12_ClassesAbstratas.classes;
// objetivo de uma classe abstrata é ser extendida

public abstract class Funcionario extends Pessoa {
    protected String clt;
    protected double salario;

    //Construtores
    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    // Métodos
    public abstract void calculaSalario();  // um método abstrato significa que obrigatóriamente deve ser
                                            // sobrescrito, por tanto quem extender a classe funcionário
                                            // é obrigado a reescrever o método calculaSalário
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
