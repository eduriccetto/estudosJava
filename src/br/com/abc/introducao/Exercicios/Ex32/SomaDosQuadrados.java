/********************************************************************************************
 * 32) Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros
 * números inteiros positivos ímpares a partir do número informado pelo usuário menor que 10
 * e maior que zero.
 *********************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex32;

import java.util.Scanner;

public class SomaDosQuadrados {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, cont = 0, soma = 0;
        boolean looping = true;

        System.out.println("==================================================");
        System.out.println("|   Soma dos quadrados de numeros entre 0 e 10   |");
        System.out.println("==================================================");

        while (looping){
            System.out.print("\nDigite um valor entre 0 e 10: ");
            n = entrada.nextInt();
            if (n >= 0 && n <= 10){
                if (n % 2 != 0){
                    n = n*2;
                    soma += n;
                    cont += 1;
                }
            }
            if (cont == 20){
                looping = false;
            }
            System.out.println("\n-------------------------");

        }

        System.out.println("===================================================================");
        System.out.println("  A soma dos quadrados dos primeiros 20 números IMPARES é: "+soma);
        System.out.println("===================================================================");

    }
}
