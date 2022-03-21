package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A3_Coesao.teste;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A3_Coesao.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.name = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.name+" idade: "+professor.idade+" sexo: "+professor.sexo);

    }
}

// Esta é a forma correta, como explicado no arquivo txt
