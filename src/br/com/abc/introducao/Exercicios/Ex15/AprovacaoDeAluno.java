package br.com.abc.introducao.Exercicios.Ex15;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class AprovacaoDeAluno {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String aluno, status = "REPROVADO!";
        double[] nota = new double[4];
        double media, recuperacao, soma = 0;

        System.out.println("=============================================");
        System.out.println("|      Calculadora de Média Escolar         |");
        System.out.println("=============================================");

        System.out.print("\nDigite o nome doi aluno: ");
        aluno = entrada.next().toUpperCase(Locale.ROOT);
        Aluno aluno1 = new Aluno(aluno);

        int contador = 0;
        while (contador != 4){
            System.out.print("Digite a nota " + (contador + 1) + " do aluno " + aluno + ": ");
            nota[contador] = entrada.nextDouble();
            contador += 1;
        }

        //   ===========  média
        for (double n: nota){
            soma += n;
        }
        media = soma / 4;
        if (media >= 7){
            status = "APROVADO!";
        }
        // ===========================

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("|                 Média do Aluno                            |");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Nome: " + aluno1 + "\n");
        int contador2 = 0;
        for (double n: nota){
            System.out.println("Nota " + (contador2 + 1) + ": " + n);
            contador2 += 1;
        }
        System.out.println("\nMédia do aluno " + aluno1 + ": " + media + "....." + status);
        if (status == "REPROVADO!"){
            System.out.println("\nAluno " + aluno1 + " em recuperação");
            System.out.print("Digite a nota da prova de recuperação: ");
            recuperacao = entrada.nextDouble();
            if (((media + recuperacao) / 2) >= 7){
                status = "APROVADO!";
                System.out.println("\n Parabens!!! Agora o aluno " + aluno1 + " esta aprovado com media: " + ((media + recuperacao)/2));
            }else {
                System.out.println("Infelizmente o aluno " + aluno + " está reprovado com média: " + ((media + recuperacao)/2));
            }

        }
        System.out.println("-------------------------------------------------------------");


    }
}
