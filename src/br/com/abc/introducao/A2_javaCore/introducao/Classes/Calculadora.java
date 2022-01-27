package br.com.abc.introducao.A2_javaCore.introducao.Classes;

public class Calculadora {
    public void soma(int n1, int n2){
        int result = n1 + n2;
        System.out.println(result);
    }

    public int subtracao(int n1, int n2){
        return n1 - n2;                      // aplicando método de retorno
    }                                        // quando um bloco de código encontra um return
                                             // ele imediatamente vai finalizar e sair do método
    public double divisao(double n1, double n2){
        return n1 / n2;
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }



}
