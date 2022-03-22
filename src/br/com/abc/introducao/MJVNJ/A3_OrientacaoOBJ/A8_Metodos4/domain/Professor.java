package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.domain;

public class Professor {

    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println("--------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);   // this faz referencia a própria variável de classe
        System.out.println(this.sexo);
    }

}
