package br.com.abc.introducao.javaCore.introducao.sobrecargaConstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

//    Construtores são os responsáveis pela criação de um objeto.
//        Podemos inicializar construtores sem nenhum ou com alguns parâmetros.
    // Uma outra forma de faze-lo é atravez dos blocos de inicialização.

    public Estudante(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula){
        this(matricula, nome, notas);   //  assim chamamos um construtor dentro de outro construtor
//        this.matricula = matricula;    // um construtor só pode ser chamado dentro de construtores
//        this.nome = nome;              // por exemplo não podemos chama-lo dentro do metodo imprimi
//        this.notas = notas;           // e este this() precisa ser obrigatoriamente a primeira linha
        this.dataMatricula = dataMatricula;
    }

    public Estudante(){           // construtor não tem retorno, nem mesmo Void

    }

    public void imprime(){
        System.out.println("===================================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        for (double nota: notas){
            System.out.println("Nota: " + nota + " ");
        }
        System.out.println("Data Matricula: " + this.dataMatricula);
        System.out.println("===================================");
    }


// Os get e set podem ser gerados automaticamente atraves de (alt + insert) selecionando Getter and Setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
