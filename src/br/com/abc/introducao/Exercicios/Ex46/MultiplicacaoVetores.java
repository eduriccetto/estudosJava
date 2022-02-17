/**********************************************************************************************
 * 46) Dados dois vetores x e y, ambos com n elementos, determinar o produto escalar desses
 * vetores. Ou seja, realizar a soma de todos dos resultados da multiplicação de x[i] por y[i].
 ***********************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex46;

import java.util.Scanner;

public class MultiplicacaoVetores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtd, n;

        System.out.println("========================================");
        System.out.println("|       Multiplicacao de Vetores       |");
        System.out.println("========================================");

        System.out.print("\n");
        System.out.print("Digite a quantidade de números a serem inseridas nos vetores: ");
        qtd = entrada.nextInt();

        int[] vetor1 = new int[qtd], vetor2 = new int[qtd], vetorResult = new int[qtd];

        System.out.println("\n");
        System.out.println("----------------------------");
        for (int x = 0; x < qtd; x++){
            System.out.println("Digite o valor "+x+" do vetor1 : ");
            n = entrada.nextInt();
            vetor1[x] = n;
        }

        System.out.println("\n");
        System.out.println("----------------------------");
        for (int x = 0; x < qtd; x++){
            System.out.println("Digite o valor "+x+" do vetor2 : ");
            n = entrada.nextInt();
            vetor2[x] = n;
        }

        for (int x = 0; x < qtd; x++){
            n = vetor1[x] * vetor2[x];
            vetorResult[x] = n;
        }

        System.out.println("\n");
        System.out.println("==================================================");
        System.out.print("Resultado: ");
        for (int x = 0; x < qtd; x++){
            System.out.print(vetorResult[x]+", ");
        }

        System.out.println("\n");
        System.out.println("======================");
        System.out.println("    Fim da Execução!  ");
        System.out.println("======================");

    }
}
