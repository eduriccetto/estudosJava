package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.domain.Calculadora;

public class CalculadoraTest2 {
    public static void main(String[] args) {

        Calculadora calculadora =  new Calculadora();

        int n1 = 1;
        int n2 = 2;

        calculadora.alteraDoisNumeros(n1,n2);

        System.out.println("Dentro da CalculadoraTest2");
        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);

    }
}
