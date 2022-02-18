/*******************************************************************************
 * 51) Fazer um programa para ler uma quantidade N de alunos. Ler a nota de cada
 * um dos N alunos e calcular a média aritmética das notas. Contar quantos alunos
 * estão com a nota acima de 7.0. Obs.: Se nenhum aluno tirou nota acima de 5.0,
 * imprimir mensagem: Não há nenhum aluno com nota acima de 5.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex51;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome;
        double nota, mediaAritmetica = 0;
        boolean loop = true;
        int cont = 0, alunos = 0, maior7 = 0, acimaDe5 = 0;

        System.out.println("==================================");
        System.out.println("|          Média dos Alunos      |");
        System.out.println("==================================");

        System.out.println("\n");
        System.out.print("Digite a quantidade de alunos: ");
        alunos = entrada.nextInt();
        System.out.println("\n");

        double[] vetorNota = new double[alunos];
        String[] vetorNome = new String[alunos];

        //  Cadastro de alunos
        for (int x = 0; x < alunos; x++) {

            System.out.print("Digite o nome do aluno: ");
            nome = entrada.next().toUpperCase(Locale.ROOT);

            System.out.print("Digite a nota do(a) "+nome+": ");
            nota = entrada.nextDouble();
            System.out.println("-------------------------------");

            vetorNome[x] = nome;
            vetorNota[x] = nota;

        }


        // média aritmética das notas de todos os alunos e verificação de maior ou igual a 7
        // e verificação se existe algum aluno acima de 5
        for (int x = 0; x < vetorNome.length; x++) {

            if (vetorNota[x]>=7){
                maior7++;
            }
            if (vetorNota[x]>5){
                acimaDe5 ++;
            }
            mediaAritmetica = mediaAritmetica + vetorNota[x];

        }
        System.out.println("\n");
        System.out.println("=============================");
        System.out.println("Média Aritmética das notas: " + mediaAritmetica/alunos);
        System.out.println("Existem " + maior7 + " alunos com notas maior ou iguais a 7.0");
        if (acimaDe5 == 0){
            System.out.println("Não há nenhum aluno com nota acima de 5.0");
        }

        System.out.println("\n");
        System.out.println("=====================");
        System.out.println("    Fim da Execução! ");
        System.out.println("=====================");

    }
}
