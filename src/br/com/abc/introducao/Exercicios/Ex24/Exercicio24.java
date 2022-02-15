/************************************************************************************
 * 24) Escreva um programa que leia dois números inteiros e apresente as opções para
 * usuário escolher o que deseja realizar:
 *
 * 1 – Verificar se um dos números lidos é ou não múltiplo do outro
 * 2 – Verificar se os dois números lidos são pares
 * 3 – Verificar se a média dos dois números é maior ou igual a 7.
 * 4 – Sair
 *************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex24;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        float n1, n2;
        String status;
        boolean media, multiplo, looping = true;

        while (looping){
            System.out.println("\n\n\n");
            System.out.println("=======================================================================");
            System.out.println("|  1 – Verificar se um dos números lidos é ou não múltiplo do outro   |");
            System.out.println("|  2 – Verificar se os dois números lidos são pares                   |");
            System.out.println("|  3 – Verificar se a média dos dois números é maior ou igual a 7.    |");
            System.out.println("|  4 – Sair                                                           |");
            System.out.println("=======================================================================");

            System.out.print("\nDigite sua opção: ");
            opcao = entrada.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("====================================================================");
                    System.out.println("|    Verificar se um dos números lidos é ou não múltiplo do outro  |");
                    System.out.println("====================================================================");

                    System.out.print("\nDigite o primeiro valor: ");
                    n1 = entrada.nextFloat();
                    System.out.print("\nDigite o segundo valor: ");
                    n2 = entrada.nextFloat();

                    multiplo = n1 % n2 == 0;
                    System.out.println("O número "+n1+" é multiplo de "+n2+": "+multiplo);

                    break;
                case 2:
                    System.out.println("====================================================================");
                    System.out.println("|    2 – Verificar se os dois números lidos são pares              |");
                    System.out.println("====================================================================");

                    System.out.print("\nDigite o primeiro valor: ");
                    n1 = entrada.nextFloat();
                    System.out.print("\nDigite o segundo valor: ");
                    n2 = entrada.nextFloat();

                    if (n1 % 2 == 0){
                        status = "é PAR";
                    }else
                        status = "não é PAR";
                    System.out.println(n1 + " " + status);

                    if (n2 % 2 == 0){
                        status = "é PAR";
                    }else
                        status = "não é PAR";
                    System.out.println(n2 + " " + status);

                    break;
                case 3:
                    System.out.println("=====================================================================");
                    System.out.println("|    3 – Verificar se a média dos dois números é maior ou igual a 7.|");
                    System.out.println("=====================================================================");

                    System.out.print("\nDigite o primeiro valor: ");
                    n1 = entrada.nextFloat();
                    System.out.print("\nDigite o segundo valor: ");
                    n2 = entrada.nextFloat();

                    media = ((n1 + n2)/2) >= 7;

                    System.out.println("\n A média dos dois valores é maior ou igual a 7: " + media);

                    break;
                case 4:
                    System.out.println("===========================");
                    System.out.println("|    Execução encerrada!  |");
                    System.out.println("===========================");
                    looping = false;
                    break;
            }
        }

    }

}
