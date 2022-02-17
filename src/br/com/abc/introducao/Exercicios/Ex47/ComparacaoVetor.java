/**********************************************************************************************
 * 47) Considere um vetor de 10 números inteiros positivos maiores que zero e um único número
 * inteiro, também positivo e maior que zero. Faça um programa para:
 * 		a. ler pelo teclado o vetor;
 * 		b. ler pelo teclado o número X;
 * 		c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.
 ***********************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex47;

import java.util.Scanner;

public class ComparacaoVetor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        int[] vetor = new int[10];
        int maior = 0, menor = 0, igual = 0;

        System.out.println("======================================");
        System.out.println("|      Comparação com Vetor          |");
        System.out.println("======================================");

        System.out.print("\n");
        for (int x = 0; x < 10; x++){
            System.out.print("Digite o valor "+(x+1)+" para o vetor: ");
            n = entrada.nextInt();

            vetor[x] = n;
        }

        System.out.println("---------------------------");
        System.out.print("\n");
        System.out.print("Digite um valor positivo para comparação com o vetor: ");
        n = entrada.nextInt();

        for (int x = 0; x < 10; x++){
            if (n == vetor[x]){
                igual ++;
            }
            if (n > vetor[x]){
                menor ++;
            }
            if (n < vetor[x]){
                maior ++;
            }
        }

        System.out.println("\n");
        System.out.println("========================================================");
        System.out.println("                        Resultado                       ");
        System.out.println("========================================================");
        System.out.println(" Existem "+maior+" números no vetor MAIORES que "+n      );
        System.out.println(" Existem "+menor+" números no vetor MENORES que "+n      );
        System.out.println(" Existem "+igual+" números no vetor IGUAIS que "+n       );
        System.out.println("========================================================");

    }
}
