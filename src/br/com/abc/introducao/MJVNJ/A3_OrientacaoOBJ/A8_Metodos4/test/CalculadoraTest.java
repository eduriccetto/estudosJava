package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Soma 2 + 2");
        System.out.println(calculadora.adcao(2,2));

        System.out.println("Subtração 2 - 2");
        System.out.println(calculadora.subtracao(2,2));

        System.out.println("Divisão 2 / 2");
        System.out.println(calculadora.divisao(2,2));

        System.out.println("Multiplicação 2 * 2");
        System.out.println(calculadora.multiplicacao(2,2));

    }
}
