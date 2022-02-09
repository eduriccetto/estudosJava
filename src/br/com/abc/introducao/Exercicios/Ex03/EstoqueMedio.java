/*************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *
 *************************************************************************/
package br.com.abc.introducao.Exercicios.Ex03;

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double estoqueMinimo, estoqueMaximo, estoqueMedio;

        System.out.println("=========================================");
        System.out.println("|         Calculadora de Estoque        |");
        System.out.println("=========================================");

        System.out.print("\nDigite o valor do Estoque Mínimo: ");
        estoqueMinimo = entrada.nextDouble();
        System.out.print("Digite o valor do Estoque Máximo: ");
        estoqueMaximo = entrada.nextDouble();

        estoqueMedio = (estoqueMaximo + estoqueMinimo) / 2;
        System.out.println("O Estoque Médio é de " + estoqueMedio);
    }
}
