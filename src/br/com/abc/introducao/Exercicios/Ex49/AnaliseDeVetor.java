/*******************************************************************************
 * 49) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50).
 * Determine e imprima quantas vezes que V1 e V2 possuem valores idênticos nas
 * mesmas posições.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex49;

import com.sun.jdi.Value;

import java.util.Scanner;

public class AnaliseDeVetor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = 0, temporaria = 0, igual = 0;
        boolean loop=true;

        System.out.println("==================================");
        System.out.println("|         Análise de Vetor       |");
        System.out.println("==================================");

        System.out.println("\n");
        while (loop){
            System.out.print("Digite um valor inteiro, positivo e menor que 50 para os tamanhos dos vetores: ");
            n = entrada.nextInt();
            if ((n>0)&&(n<=50)){
                loop = false;
            }
        }

        System.out.println("-----------------------------------");
        System.out.println("\n");
        System.out.println("Vetor 1");
        System.out.println("-----------------------------------");

        int[] vetor1 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nDigite o valor "+(i+1)+" do vetor: ");
            temporaria = entrada.nextInt();
            vetor1[i] = temporaria;
        }

        System.out.println("-----------------------------------");
        System.out.println("\n");
        System.out.println("Vetor 2");
        System.out.println("-----------------------------------");

        int[] vetor2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nDigite o valor "+(i+1)+" do vetor: ");
            temporaria = entrada.nextInt();
            vetor2[i] = temporaria;
        }


        System.out.println("\n");
        System.out.println("-----------------------------------------------------");
        for(int x = 0; x < n; x++){
            if(vetor1[x]==vetor2[x]){
                System.out.println("Valores da Posiço "+(x+1)+" dos vetores é igual.");
            }
        }
        System.out.println("-----------------------------------------------------");

    }
}
