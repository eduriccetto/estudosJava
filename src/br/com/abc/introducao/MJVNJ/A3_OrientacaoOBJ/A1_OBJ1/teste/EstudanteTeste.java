package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A1_OBJ1.teste;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A1_OBJ1.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
