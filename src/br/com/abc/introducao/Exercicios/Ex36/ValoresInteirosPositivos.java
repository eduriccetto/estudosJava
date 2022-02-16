/*******************************************************************************
 * 36) Faça um programa que leia 10 valores inteiros e positivos e:
 * - Encontre o maior valor
 * - Encontre o menor valor
 * - Calcule a média dos números lidos
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex36;

import java.util.Scanner;

public class ValoresInteirosPositivos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, media, maior = 0, menor = 2000, cont = 0;

        System.out.println("=============================================");
        System.out.println("|         Valores Inteiros Positivos        |");
        System.out.println("=============================================");
        System.out.println("\n");
        while (cont != 10){

            System.out.print("\nDigite um valor inteiro positivo: ");
            n = entrada.nextInt();
            if (n >= 0){
                if (n > maior){
                    maior = n;
                }
                if (n < menor){
                    menor = n;
                }
                cont +=1;
            }

        }

        media = (maior + menor) / 2;
        System.out.println("----------------------------");
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        System.out.println("Media entre maior e menor: "+media);

        System.out.println("=======================");
        System.out.println("|    Fim da Execução  |");
        System.out.println("=======================");

    }
}
