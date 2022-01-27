package br.com.abc.introducao.javaCore.introducao.sobrecargaMetodos.classes;

public class Funcionarios {
    private String nome;
    private String cpf;
    private String rg;
    private double salario;
    private int idade;
  //==================================================   método de cadastrar
    public void cadastrar(String nome, String cpf, String rg, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }
  //==================================================   método de cadastrar2
    // A sobrecarga de métodos permite que eu tenha dois métodos com o mesmo nome,
    // porém com o número ou tipo de parâmetros diferentes.
    public void cadastrar(String nome, String cpf, String rg, double salario, int idade){
        cadastrar(nome, cpf, rg, salario);
//        this.nome = nome;                     AO invés de repetir cód podemos primeiro já
//        this.cpf = cpf;                       chamar o primeiro método cadastrar
//        this.rg = rg;
//        this.salario = salario;
        this.idade = idade;
    }
  //==================================================   método de impressão
  public void print(){
      System.out.println("===============================================");
      System.out.println("||       Nome: " + this.nome);
      System.out.println("||       CPF: " + this.cpf);
      System.out.println("||       RG: " + this.rg);
      System.out.println("||       Salário : " + this.salario);
      System.out.println("||       Idade : " + this.idade);
      System.out.println("===============================================");
  }
  //==================================================   setters
    public void setNome (String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
  //==================================================  getters
    public String getNome(){ return this.nome; }
    public String getCpf(){ return this.cpf; }
    public String getRg(){ return this.rg; }
    public double getSalario(){ return this.salario; }
    public int getIdade(){ return this.idade; }
}
