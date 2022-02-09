/*************************************************************************
 *  2) Faça um programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/
package br.com.abc.introducao.Exercicios.Ex04;

import java.util.Scanner;

public class ConversorDolar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double dolar, real, cotacao;

        System.out.println("============================================");
        System.out.println("|       Conversor de Dolar p/ Real         |");
        System.out.println("============================================");

        System.out.print("\nDigite o valor em dolar: ");
        dolar = entrada.nextDouble();
        System.out.print("Digite o valor da cotação: ");
        cotacao = entrada.nextDouble();

        real = (double) (Math.round((dolar * cotacao)*100.0)/100.0);

        System.out.println("\n==============================");
        System.out.println("Dolar: $" + dolar);
        System.out.println("Cotação: R$" + cotacao);
        System.out.println("Real: R$" + real);
        System.out.println("==============================");

    }
}
