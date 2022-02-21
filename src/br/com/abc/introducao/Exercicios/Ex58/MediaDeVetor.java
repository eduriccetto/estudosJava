/*******************************************************************************
 * 58) Fazer um programa para armazenar em um vetor, vários números inteiros e
 * positivos e calcular a média. Imprimir também o maior. A quantidade de números
 * lidos será definida pelo usuário.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex58;

import java.util.Scanner;

public class MediaDeVetor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, n1, cont = 0;
        double media = 0;
        boolean loop = true;

        System.out.println("==============================");
        System.out.println("|      Media de um Vetor     |");
        System.out.println("==============================");

        System.out.println("\n");
        System.out.print("Digite o tamanho do vetor: ");
        n1= entrada.nextInt();

        int[] vetor = new int[n1];

        System.out.println("\n");
        while (loop){
            System.out.print("Digite o valor "+(cont+1)+" para o vetor: ");
            n = entrada.nextInt();
            if (n > 0){
                vetor[cont] = n;
                cont ++;
            }
            if (cont == n1){
                loop = false;
            }
        }

        for (int i = 0; i < n1; i++) {
            System.out.print(vetor[i]);
            media += vetor[i];
        }

        System.out.println("\n");
        System.out.println("===========================================");
        System.out.println(" A media de valores do vetor é de: "+ (double) Math.round(((media/n1)*100)/100));
        System.out.println("===========================================");
        System.out.println("\n");
        System.out.println("------------------");
        System.out.println("  Fim da Execução ");
        System.out.println("------------------");

    }
}
