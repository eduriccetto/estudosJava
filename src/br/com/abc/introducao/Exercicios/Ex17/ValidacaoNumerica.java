/*******************************************************************************
 * 17) Escreva um programa que leia um número inteiro. Verificar por meio de
 * condição se o valor fornecido está na faixa entre 0 (zero) e 9 (nove).
 * Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor
 * válido”. Caso contrário, apresentar a mensagem “valor inválido”.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex17;

import java.util.Scanner;

public class ValidacaoNumerica {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1;

        System.out.println("==========================================");
        System.out.println("|          Validador Numérico            |");
        System.out.println("==========================================");

        System.out.print("\nDigite um valor inteiro entre 0 e 9: ");
        n1 = entrada.nextInt();

        if (n1 >= 0 && n1 <= 9){
            System.out.println("--------------------------------");
            System.out.println("       Valor Valido!");
            System.out.println("--------------------------------");
        }else {
            System.out.println("--------------------------------");
            System.out.println("       Valor Inválido!");
            System.out.println("--------------------------------");
        }

    }
}
