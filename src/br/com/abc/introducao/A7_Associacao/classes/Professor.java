package br.com.abc.introducao.A7_Associacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    // ==========================   Construtores

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }
    //===========================    Método

    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Seminários participantes: ");
        for (Seminario seminario : seminarios) {
            System.out.print(seminario.getTitulo() + " ");
        }
    }

    // ==========================    Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
