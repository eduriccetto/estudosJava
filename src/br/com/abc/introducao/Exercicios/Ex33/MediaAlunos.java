
/*******************************************************************************
 * 33) Escreva um programa que calcule e exiba a média da nota dos alunos de uma
 * turma em uma prova. O número de alunos é desconhecido. Os dados de um aluno
 * são: nome e a sua nota na prova em questão.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex33;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome, cadastro = "";
        int qtdAlunos = 0;
        float nota, mediaFinal, media = 0;

        System.out.println("=====================================");
        System.out.println("|        Media dos Alunos           |");
        System.out.println("=====================================");

        while (cadastro != "N"){

            System.out.println("\n");
            System.out.print("\nDeseja cadastrar um aluno[S/N]: ");
            cadastro = entrada.next().toUpperCase(Locale.ROOT);
            if (cadastro.equals("N")){
                break;
            }
            System.out.print("Digite o nome do aluno: ");
            nome = entrada.next().toUpperCase(Locale.ROOT);
            System.out.print("Digite a nota do aluno "+nome+": ");
            nota = entrada.nextFloat();
            qtdAlunos += 1;
            media += nota;

        }

        mediaFinal = media/qtdAlunos;
        System.out.println("---------------------------------");
        System.out.println("\n");
        System.out.println("A media dos alunos cadastrados foi: "+ mediaFinal);

        System.out.println("===========================");
        System.out.println("|      Fim da Execução    |");
        System.out.println("===========================");

    }
}
