/*******************************************************************************
 * 56) Fazer um programa para ler um vetor de inteiros positivos de 50 posições.
 * Imprimir a quantidade de números pares e de múltiplos de 5.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex56;

import java.util.Scanner;

public class AnaliseDeVetor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = 0, cont = 0, pares = 0, multiplos = 0;
        boolean loop = true;
        int[] vetor = new int[50];


        System.out.println("====================================");
        System.out.println("|         Analise de Vetor         |");
        System.out.println("====================================");

        System.out.println("\n");

        while (loop){
            if (cont == 49){
                loop = false;
            }
            System.out.print("digite um valor inteiro positivo: ");
            n = entrada.nextInt();
            if (n > 0){
                vetor[cont] = n;
                cont ++;

            }
        }

        System.out.println("\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            if (vetor[i] % 2 == 0){
                pares ++;
            }
            if (vetor[i] % 5 == 0){
                multiplos ++;
            }
        }

        System.out.println("\n");
        System.out.println("================================");
        System.out.println("Pares: "+pares);
        System.out.println("Multiplos de 5: "+multiplos);
        System.out.println("================================");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("---------------------");
        System.out.println("   Fim da Execução  |");
        System.out.println("---------------------");

    }
}
