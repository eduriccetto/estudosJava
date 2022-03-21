package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A7_Metodos3.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A7_Metodos3.domain.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calculadora =  new Calculadora();
        double result =  calculadora.divisao(10,3);

        System.out.println(result);
        // ou
        System.out.println(calculadora.divisao(15,5));

    }

}
