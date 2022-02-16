/*******************************************************************************
 * 39) Faça um programa que leia um número inteiro e mostre uma mensagem
 * indicando se este número é par ou ímpar, e se é positivo ou negativo. O
 * programa só deve parar de rodar quando o usuário responder "S" na seguinte
 * pergunta, "Deseja encerrar o programa?" .
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex39;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class ParImparPositivoNegativo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        String status;
        boolean loop = true;

        System.out.println("=========================================");
        System.out.println("|  PAR ou IMPAR / POSITIVO ou NEGATIVO  |");
        System.out.println("=========================================");

        while (loop){

            System.out.print("\nDigite um número inteiro: ");
            n = entrada.nextInt();
            System.out.println("\n--------------------------------");
            if (n == 0){
                System.out.println(n + " é um número NULL");
            }else {
                if (n<0) {
                    System.out.println(n + " é um número Negativo");
                }else {
                    System.out.println(n + " é um número Positivo");
                }

                if (n % 2 == 0){
                    System.out.println(n + " é um número PAR");
                }else {
                    System.out.println(n + " é um número IMPAR");
                }
            }

            System.out.println("--------------------------------");


            System.out.print("\nDeseja encerrar o programa[S/n]: ");
            status = entrada.next().toUpperCase(Locale.ROOT);
            if (status.equals("S")){
                loop = false;
            }
        }

        System.out.println("\n");
        System.out.println("=====================");
        System.out.println("|  Fim da Execução  |");
        System.out.println("=====================");

    }
}
