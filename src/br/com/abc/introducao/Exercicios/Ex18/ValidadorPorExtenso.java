/************************************************************************************************
 * 18) Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código
 * é igual a 1, igual a 2 ou igual a 3. Caso não seja, apresentar a mensagem “Código inválido”.
 * Ao ser verificado o código e constatado que é um valor válido, o programa deve verificar cada
 * código em separado para determinar seu valor por extenso, ou seja, apresentar a mensagem
 * “um”, ”dois” ou “três”. (Utilizar o comando Switch).
 *************************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex18;

import br.com.abc.introducao.A1_ComandosBasicos.Swich;

import java.util.Scanner;

public class ValidadorPorExtenso {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1;
        String valor = "";

        System.out.println("=========================================");
        System.out.println("        Validador por Extenso           |");
        System.out.println("=========================================");


        System.out.print("\nDigite um valor inteiro entre 1 e 3: ");
        n1 = entrada.nextInt();

        if (n1 >= 1 && n1 <= 3){
            switch (n1) {
                case 1 -> valor = "Um";
                case 2 -> valor = "Dois";
                case 3 -> valor = "Três";
            }
            System.out.println("-------------------------------------");
            System.out.println("           Valor Válido!");
            System.out.println("      O valor digitado foi: " + valor);
            System.out.println("-------------------------------------");
        }else {
            System.out.println("-------------------------------------");
            System.out.println("           Valor Inválido!");
            System.out.println("-------------------------------------");
        }

    }
}
