package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.domain;

public class ImpressoraEstudante {

    public void imprime(Estudante estudante){

        estudante.name = "Gohan";

        System.out.println("------------------------");
        System.out.println("Nome: "+estudante.name);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);

    }

}
