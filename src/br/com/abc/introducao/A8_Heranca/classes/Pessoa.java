
// Herança é utilizado em java por dois motivos:
    // 1- você reaproveitar o código.
    // 2- você utilizar polimorfismo
// Em associação utilizamos a palavra "tem" e em herança a palavra "é".

package br.com.abc.introducao.A8_Heranca.classes;

public class Pessoa {
    protected String nome;  // utilizamos o protected quando queremos que as classes filhas utilizem essa herança
    private String cpf;
    private Endereço endereço;

    // Método
    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereço.getRua());
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}
