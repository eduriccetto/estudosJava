/*******************************************************************************
 * 34) Escreva um programa que leia um conjunto de números positivos e exiba o
 * menor e o maior. Suporemos que o número de elementos deste conjunto não é
 * conhecido, e que um número negativo será utilizado para sinalizar o fim dos
 * dados.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex34;

import java.util.Scanner;

public class LeituraNumerosPositivos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, maior = 0 , menor = 20000;

        System.out.println("==========================================");
        System.out.println("|      Leitura de Números Positivos      |");
        System.out.println("==========================================");

        while (true){
            System.out.print("\nDigite um valor inteiro positivo: ");
            n = entrada.nextInt();
            if (n < 0){
                break;
            }
            if (n > maior){
                maior = n;
            }
            if (n < menor){
                menor = n;
            }
        }

        System.out.println("\n");
        System.out.println("---------------------------");
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        System.out.println("=============================");
        System.out.println("|        Fim da Execução    |");
        System.out.println("=============================");

    }
}
