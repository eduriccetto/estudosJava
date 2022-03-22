package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor01 = new Professor();
        Professor professor02 = new Professor();

        professor01.nome = "Carlos";
        professor01.idade = 42;
        professor01.sexo = 'M';

        professor02.nome = "Maria";
        professor02.idade = 37;
        professor02.sexo = 'F';

        professor01.imprime();
        professor02.imprime();

    }
}
