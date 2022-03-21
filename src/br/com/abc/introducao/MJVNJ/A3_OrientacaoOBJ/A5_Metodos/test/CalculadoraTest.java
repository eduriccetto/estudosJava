package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A5_Metodos.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A5_Metodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.soma();
        System.out.println("Finalizando CalculadoraTest");
        calculadora.subtrair();

    }
}
