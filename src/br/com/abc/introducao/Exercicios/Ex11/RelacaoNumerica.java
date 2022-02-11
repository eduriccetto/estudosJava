/*******************************************************************************
 * 10) Escrever um programa que leia dois números inteiros e mostre todos os
 * relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis
 * são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex11;

import java.util.Scanner;

public class RelacaoNumerica {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        String result;

        System.out.println("=================================================");
        System.out.println("|               Relação Numérica                |");
        System.out.println("=================================================");

        System.out.println("Digigite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Digigite o segundo número: ");
        n2 = entrada.nextInt();

        if (n1 == n2){ // igual
            System.out.println("O número " + n1 + " é igual ao número " + n2);
        }
        if (n1 != n2){ // Não igual
            System.out.println("O número " + n1 + " é diferente ao número " + n2);
        }
        if (n1 > n2){ // Maior
            System.out.println("O número " + n1 + " é maior que o número " + n2);
        }
        if (n1 < n2){ // Menor
            System.out.println("O número " + n1 + " é menor que o número " + n2);
        }
        if (n1 >= n2){ // Maior ou igual
            System.out.println("O número " + n1 + " é maior ou igual ao número " + n2);
        }
        if (n1 <= n2){ // Menor ou igual
            System.out.println("O número " + n1 + " é menor ou igual ao número " + n2);
        }

    }
}
