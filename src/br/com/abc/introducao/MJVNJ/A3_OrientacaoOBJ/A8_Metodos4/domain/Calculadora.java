package br.com.abc.introducao.MJVNJ.A3_OrientacaoOBJ.A8_Metodos4.domain;

public class Calculadora {

    public double divisao(double n1, double n2){
        return n1 / n2;
    }

    public double multiplicacao(double n1, double n2){
        return n1 * n2;
    }

    public double adcao(double n1, double n2){
        return n1 + n2;
    }

    public double subtracao(double n1, double n2){
        return n1 - n2;
    }

    public void alteraDoisNumeros(int n1, int n2){
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro do alteraDoisNumeros: ");
        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);
    }

}
