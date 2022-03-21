package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.domain.Estudante;
import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.domain.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.name = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.name = "Sakura";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        System.out.println("Nome: "+estudante01.name);
        System.out.println("Idade: "+estudante01.idade);
        System.out.println("Sexo: "+estudante01.sexo);

        System.out.println("===========================");

        System.out.println("Nome: "+estudante02.name);
        System.out.println("Idade: "+estudante02.idade);
        System.out.println("Sexo: "+estudante02.sexo);

        System.out.println("\n\n");
        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);

    }
}
