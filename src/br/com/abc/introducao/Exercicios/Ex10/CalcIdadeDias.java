/*******************************************************************************
 * 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
 * dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
 * com 365 dias e mês com 30 dias.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex10;

import java.util.Date;
import java.util.Scanner;

public class CalcIdadeDias {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int dia, mes, ano, idadeEmDias;

        System.out.println("==========================================================");
        System.out.println("           Calculadora de idade em dias                  |");
        System.out.println("==========================================================");

        System.out.print("\nDigite sua idade em dias: ");
        dia = entrada.nextInt();
        System.out.print("Digite sua idade em meses: ");
        mes = entrada.nextInt();
        System.out.print("Digite sua idade em anos: ");
        ano = entrada.nextInt();

        idadeEmDias = ano * 365 + mes * 30 + dia;
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Sua idade é: " + idadeEmDias + ", você tem portanto, " + idadeEmDias + " dias de vida");
        System.out.println("-----------------------------------------------------------------------------------");


    }
}
