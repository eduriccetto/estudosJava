package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.OBJ2.teste;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.OBJ2.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        System.out.println(estudante);  // Assim imprimindo apenas um endereço de memória

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);   // Aqui imprimindo os valores da memória
        System.out.println(estudante.sexo);  // mas como as variáveis ainda não foram inicializadas
                                             // está então imprimindo os valores padrão.

    }
}
