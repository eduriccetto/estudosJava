/*******************************************************************************
 * 21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela
 * indicando se este número é positivo ou negativo. Pare a execução do programa
 * quando o usuário requisitar.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex21;

import java.util.Locale;
import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, status = 666;
        String positivoNegativo;

        System.out.println("================================================");
        System.out.println("|  Verificador de número positivo ou negativo  |");
        System.out.println("================================================");

        do {
            System.out.print("Para continuar digite qualquer número, ou 666 para sair: ");
            status = entrada.nextInt();

            if (status == 666){
                break;
            }

            //====================================

            System.out.println("\n---------------------------------------");
            System.out.print("Digite um valor inteiro: ");
            n = entrada.nextInt();

            if (n >= 0){
                positivoNegativo = "POSITIVO";
            }else {
                positivoNegativo = "NEGATIVO";
            }

            System.out.println("\n============================================");
            System.out.println(" O valor digitado: " + n + " é um valor: " + positivoNegativo);
            System.out.println("============================================");

        }while (status != 666);

        System.out.println("\n----------------------------");
        System.out.println("|     Fim da execução      |");
        System.out.println("----------------------------");

    }
}
