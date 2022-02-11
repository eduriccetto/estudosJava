/*******************************************************************************
 * 11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
 * valores de modo que a variável A passe a possuir o valor da variável B, e a
 * variável B passe a possuir o valor da variável A. Apresentar os valores
 * trocados.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex12;

import java.util.Scanner;

public class ValoresTrocados {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a, b, variavelTemporaria;

        System.out.println("===============================================");
        System.out.println("|          Valores de variáveis trocadas      |");
        System.out.println("===============================================");

        System.out.print("\n Digite um valor inteiro para a primeira variável A: ");
        a = entrada.nextInt();
        System.out.print("Digite um valor inteiro para a segunda variável B: ");
        b = entrada.nextInt();

        System.out.println("----------------------------------------------");
        System.out.println("A variavel A é: " + a);
        System.out.println("A variavel B é: " + b);
        variavelTemporaria = a;
        a = b;
        b = variavelTemporaria;
        System.out.println("*************");
        System.out.println("Com os valores trocados:");
        System.out.println("Variável A: " + a);
        System.out.println("Variável B: " + b);
        System.out.println("----------------------------------------------");



    }
}
