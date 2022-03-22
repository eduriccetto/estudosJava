package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A9_ModificadoresDeAcesso.domain;

public class Pessoa {
    public String name;
    public int idade;
    private char sexo;


    public void imprime(){
        System.out.println("\n------------------");
        System.out.println(this.name);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

    public void setSexo(char sexo){
        this.sexo = sexo;                // com este metodo liberamos o uso do privado para ser setado
    }

    public char getSexo(){
        return this.sexo;
    }
}
