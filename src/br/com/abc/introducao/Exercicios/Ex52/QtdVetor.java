/*******************************************************************************
 * 52) Fazer um programa ler um vetor de inteiros e imprimir quantas
 * vezes aparece o número 1, 3 e 4, nesta ordem. O vetor terá no máximo 100
 * posições.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex52;

import java.util.Scanner;

public class QtdVetor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean loop = true;
        int tamanhoVetor = 0, n, n1=0, n3=0, n4=0;

        System.out.println("================================");
        System.out.println("|       Analise de Vetor       |");
        System.out.println("================================");

        System.out.println("\n");
        while (loop){

            System.out.print("Digite um valor para o tamanho do vetor: ");
            tamanhoVetor = entrada.nextInt();

            if (tamanhoVetor > 0 && tamanhoVetor <= 100){
                loop = false;
            }
        }

        int[] vetor = new int[tamanhoVetor];
        for (int x = 0; x < tamanhoVetor; x++){

            System.out.print("Digite um valor: ");
            n = entrada.nextInt();
            vetor[x] = n;

        }

        System.out.println("\n");
        System.out.println("------------------------------");
        System.out.print("Vetor: ");
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i] == 1){
                n1 ++;
            }
            if (vetor[i] == 3){
                n3 ++;
            }
            if (vetor[i] == 4){
                n4 ++;
            }
            System.out.print(vetor[i]+", ");
        }
        System.out.println("\n");
        System.out.println("---------------------");
        System.out.println("O número 1 aparece "+n1+" vezes no vetor!");
        System.out.println("O número 3 aparece "+n3+" vezes no vetor!");
        System.out.println("O número 4 aparece "+n4+" vezes no vetor!");

        System.out.println("\n");
        System.out.println("===================");
        System.out.println("  Fim da Execução! ");
        System.out.println("===================");

    }
}
