/*******************************************************************************
 * 48) Uma agência de publicidade pediu à agência de modelos Luz & Beleza para
 * encontrar uma modelo que tenha idade entre 18 e 20 anos para participar de
 * uma campanha publicitária milionária de produtos de beleza. Foram inscritas
 * 20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações
 * foram armazenadas em 2 vetores distintos. Faça um programa para imprima o
 * vetor que contém os nomes das candidatas aptas a concorrer a uma vaga para
 * a campanha milionária.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex48;

import java.util.Locale;
import java.util.Scanner;

public class VagaDeModelo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] vetorIdade = new int[20];
        String[] vetorNnome = new String[20];
        int idade;
        String nome;

        System.out.println("==============================");
        System.out.println("|        Vaga de Modelo      |");
        System.out.println("==============================");

        System.out.println("\n");
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o nome da modelo "+(i+1)+": ");
            nome = entrada.next().toUpperCase(Locale.ROOT);
            System.out.print("Digite a idade da modelo "+(i+1)+": ");
            idade = entrada.nextInt();

            vetorIdade[i] = idade;
            vetorNnome[i] = nome;

        }

        System.out.println("---------------------------------");
        System.out.println("Meninas aptas à vaga: ");
        System.out.println("---------------------------------");
        for (int i = 0; i < vetorIdade.length; i++) {
            if ((vetorIdade[i]>=18)&&(vetorIdade[i]<=20)){
                System.out.println("Nome: "+vetorNnome[i]+" Idade: "+vetorIdade[i]);
                System.out.println("-----------------");
            }
        }

    }
}
