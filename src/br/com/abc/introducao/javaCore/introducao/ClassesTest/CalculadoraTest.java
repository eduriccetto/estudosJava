package br.com.abc.introducao.javaCore.introducao.ClassesTest;

import br.com.abc.introducao.javaCore.introducao.Classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora Calc = new Calculadora();
        Calc.soma(2,2);
        System.out.println(Calc.subtracao(4,2));    // aplicando método de retorno
        System.out.println(Calc.divisao(210,15));


    }
}
