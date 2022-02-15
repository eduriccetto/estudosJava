/**********************************************************************************************
 * 31) Escrever um programa que leia um conjunto de números positivos, e exiba se o número
 * lido é par ou ímpar. Exiba ao final a soma total dos números pares lidos e também a soma dos
 * números ímpares lidos. Suporemos que o número de elementos deste conjunto não é
 * conhecido, e que um número negativo será utilizado para sinalizar o fim dos dados.
 ***********************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex31;

import java.util.Scanner;

public class TratamentoNumerico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = 0, somaPar = 0, somaImpar = 0;

        System.out.println("============================================");
        System.out.println("|          Tratamento Numérico             |");
        System.out.println("============================================");

        while (n >= 0){
            System.out.println("Quando quizer finalizar a execução digite um numero negativo...");
            System.out.print("\nDigite um valor: ");
            n = entrada.nextInt();
            if (n < 0){
                break;
            }
            if (n % 2 == 0){
                System.out.println(n+" é um número PAR...");
                somaPar += n;
            }else {
                System.out.println(n+" é um número IMPAR...");
                somaImpar += n;
            }
        }
        System.out.println("\n-------------------------------------------------");
        System.out.println("A soma dos números PARES é: "+somaPar);
        System.out.println("A soma dos números IMPARES é: "+somaImpar);
    }
}
