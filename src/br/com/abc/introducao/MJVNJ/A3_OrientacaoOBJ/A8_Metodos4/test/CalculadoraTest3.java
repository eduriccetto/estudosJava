package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.test;

import br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.domain.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaArray(new int[]{1,2,3});

        // está é a forma diferente que chamamos com varArgs

        calculadora.somaVarArgs(1,2,3,4,5);
        calculadora.somaVarArgs(1,2,3);
        calculadora.somaVarArgs(numeros);

        // outra forma

        calculadora.somaVarArgs2(2,numeros);

    }
}
