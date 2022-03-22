package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A9_ModificadoresDeAcesso.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A9_ModificadoresDeAcesso.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.name = "Jiraya";
        pessoa.idade = 70;     // Se tirarmos o comentario de pessoa.sexo, veremos um erro.
        //pessoa.sexo = 'M'; // Aparece um erro, pois como é um atributo privado, não é nem para saber da
                           // existencia deste atributo nesta classe.

        pessoa.setSexo('M'); // aqui está a forma correta de atribuir um valor a um atributo privado

        pessoa.imprime();

        System.out.println(pessoa.getSexo()); // utilizamos o get para pegar este dado privado

    }
}
