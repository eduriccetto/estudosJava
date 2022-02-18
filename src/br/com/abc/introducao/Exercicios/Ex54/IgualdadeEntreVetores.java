/*******************************************************************************
 * 54) Dado dois vetores, A (5 elementos) e B (8 elementos), faça um programa em
 * C que imprima todos os elementos comuns aos dois vetores.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex54;

import java.util.Scanner;

public class IgualdadeEntreVetores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("|  Verificação de Igualdade Entre Vetores   |");
        System.out.println("=============================================");

        System.out.println("\n");
        System.out.println("    Vetor A: {1,2,3,4,5} ");
        System.out.println("    Vetor B: {1,2,3,4,5,6,7,8} ");

        int n, cont = 0;
        int[] vetorA = {1,2,3,4,5};
        int[] vetorB = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (i == j){
                   cont ++;
                }
            }
        }
        int cont2 = 0;
        int[] vetorC = new int[cont];
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (i == j){
                    vetorC[cont2] = vetorB[j];
                    cont2 ++;
                }
            }
        }
        System.out.println("\n");
        System.out.println("----------------------------------------------------------");
        System.out.print("Estes são os valores em comum entre os vetores A e B: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i]+", ");
        }
        System.out.println("\n");
        System.out.println("====================");
        System.out.println("  Fim da Execução!  ");
        System.out.println("====================");

    }
}
