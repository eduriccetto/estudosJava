/*******************************************************************************
 * 27) Escreva um programa que leia:
 *   - a quantidade de números que deverá processar;
 *   - os números que deverá processar,e calcule e exiba, para cada número a ser
 *     processado o seu fatorial.
 * Lembrete: O fatorial de um número N é dado pela fórmula:
 *     N! = 1 * 2 * 3 * 4 * 5 * ... * N
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex27;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtd, n1;

        System.out.println("============================================");
        System.out.println("|          Calculadora de Fatoriais        |");
        System.out.println("============================================");

        System.out.print("\nDigite a quandidade de numeros que deseja fatoras: ");
        qtd = entrada.nextInt();
        for (int x = 0; x<=qtd-1; x++){
            System.out.print("Digite um valor inteiro para ser fatorado: ");
            n1 = entrada.nextInt();
            int fat = 1;
            int valor = n1;

            for( int i = 2; i <= valor; i++ )
            {
                fat *= i;
            }

            System.out.println( "O fatorial de " + valor + " é igual a " + fat );
        }

    }
}
