package br.com.abc.introducao.A11_Enumercao.classe;

public class Cliente {
    private String nome;
    public static final int PESSOA_FISICA = 1;
    public static final int PESSOA_JURIDICA = 2;
    private int tipo;


    // Métodos
    @Override
    public String toString() {
        String tipo;
        if (this.tipo == 1){
            tipo = "Pessoa Fisica";
        }else {
            tipo = "Pessoa Juridica";
        }
        return "Nome: " + this.nome + "\n" + "tipo do cliente: " + tipo;
    }

    // Construtor
    public Cliente(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
