/*******************************************************************************
 * 23) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada
 * uma delas:
 *		1 – Adição
 *		2 – Subtração
 *		3 – Multiplicação
 *		4 – Divisão
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex23;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float n1, n2, result = 0;
        int operacao;
        String operador = "", soma = "+", subtracao = "-", multiplicacao = "*", divisao = "/";

        System.out.println("==================================");
        System.out.println("|           Calculadora          |");
        System.out.println("==================================");

        System.out.println("Opções: ");
        System.out.println("1 – Adição");
        System.out.println("2 – Subtração");
        System.out.println("3 – Multiplicação");
        System.out.println("4 – Divisão");
        System.out.print("Digite a opção de calculo que deseja fazer: ");
        operacao = entrada.nextInt();

        System.out.print("Digite o primeiro valor: ");
        n1 = entrada.nextFloat();
        System.out.print("Digite o segundo valor: ");
        n2 = entrada.nextFloat();

        switch (operacao) {
            case 1 -> {
                result = n1 + n2;
                operador = soma;
            }
            case 2 -> {
                result = n1 - n2;
                operador = subtracao;
            }
            case 3 -> {
                result = n1 * n2;
                operador = multiplicacao;
            }
            case 4 -> {
                result = n1 / n2;
                operador = divisao;
            }
        }

        System.out.println("===================================================");
        System.out.println("| Resultado de " + n1 + " " + operador + " " + n2 + " = " + result);
        System.out.println("===================================================");


    }
}
