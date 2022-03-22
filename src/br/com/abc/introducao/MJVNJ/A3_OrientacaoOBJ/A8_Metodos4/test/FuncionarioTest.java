package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "João";
        funcionario.idade = 30;
        funcionario.salario[0] = 1200;
        funcionario.salario[1] = 987.32;
        funcionario.salario[2] = 2000;

        funcionario.imprimeFuncionario();
        funcionario.mediaSalario();


    }
}
