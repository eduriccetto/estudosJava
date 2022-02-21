/*******************************************************************************
 * 59) Escreva um programa que solicite dois caracteres de A a Z ao usuário e
 * imprima o número de caracteres existente entre eles. Assuma que o usuário
 * digite os 2 caracteres em ordem alfabética. Caso não o estejam, emitir
 * mensagem de erro.
 * Exemplo: Digite 2 caracteres: j t O numero de caracteres entre eles é: 9
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex59;

import java.util.Locale;
import java.util.Scanner;

public class Alfabeto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String letra1, letra2, alfabeto = "ABCDEFGHIJKLMNOPQRSTUVXWYZABCDEFGHIJKLMNOPQRSTUVXWYZ";
        int inicio = 0, fim = 0;

        System.out.println("=======================");
        System.out.println("|  Analise Alfabetica |");
        System.out.println("=======================");
        System.out.println("\n");

        System.out.print("Digite a primeira letra: ");
        letra1 = entrada.next().toUpperCase(Locale.ROOT);
        System.out.print("Digite a segunda letra: ");
        letra2 = entrada.next().toUpperCase(Locale.ROOT);

        switch (letra1){
            case "A":
                inicio = 1;
                break;
            case "B":
                inicio = 2;
                break;
            case "C":
                inicio = 3;
                break;
            case "D":
                inicio = 4;
                break;
            case "E":
                inicio = 5;
                break;
            case "F":
                inicio = 6;
                break;
            case "G":
                inicio = 7;
                break;
            case "H":
                inicio = 8;
                break;
            case "I":
                inicio = 9;
                break;
            case "J":
                inicio = 10;
                break;
            case "K":
                inicio = 11;
                break;
            case "L":
                inicio = 12;
                break;
            case "M":
                inicio = 13;
                break;
            case "N":
                inicio = 14;
                break;
            case "O":
                inicio = 15;
                break;
            case "P":
                inicio = 16;
                break;
            case "Q":
                inicio = 17;
                break;
            case "R":
                inicio = 18;
                break;
            case "S":
                inicio = 19;
                break;
            case "T":
                inicio = 20;
                break;
            case "U":
                inicio = 21;
                break;
            case "V":
                inicio = 22;
                break;
            case "X":
                inicio = 23;
                break;
            case "W":
                inicio = 24;
                break;
            case "Y":
                inicio = 25;
                break;
            case "Z":
                inicio = 26;
                break;
        }
        //    letra 2
        switch (letra2){
            case "A":
                fim = 1;
                break;
            case "B":
                fim = 2;
                break;
            case "C":
                fim = 3;
                break;
            case "D":
                fim = 4;
                break;
            case "E":
                fim = 5;
                break;
            case "F":
                fim = 6;
                break;
            case "G":
                fim = 7;
                break;
            case "H":
                fim = 8;
                break;
            case "I":
                fim = 9;
                break;
            case "J":
                fim = 10;
                break;
            case "K":
                fim = 11;
                break;
            case "L":
                fim = 12;
                break;
            case "M":
                fim = 13;
                break;
            case "N":
                fim = 14;
                break;
            case "O":
                fim = 15;
                break;
            case "P":
                fim = 16;
                break;
            case "Q":
                fim = 17;
                break;
            case "R":
                fim = 18;
                break;
            case "S":
                fim = 19;
                break;
            case "T":
                fim = 20;
                break;
            case "U":
                fim = 21;
                break;
            case "V":
                fim = 22;
                break;
            case "X":
                fim = 23;
                break;
            case "W":
                fim = 24;
                break;
            case "Y":
                fim = 25;
                break;
            case "Z":
                fim = 26;
                break;
        }
        if (inicio > fim){
            System.out.println("\n");
            System.out.println("As letras devem ser digitadas em ordem alfabética... =(");
        }else {

            int diferenca = 0;
            diferenca = (fim - inicio) - 1;

            System.out.println("\n");
            System.out.println("==============================================");
            System.out.println("Posição letra 1("+letra1+"): "+inicio);
            System.out.println("Posição letra 2("+letra2+"): "+fim);
            System.out.println("\n");
            System.out.println("Existem "+diferenca+" letras entre "+letra1+" e "+letra2);
            System.out.println("==============================================");
        }

        System.out.println("\n");
        System.out.println("----------------------");
        System.out.println("   Fim da Execução!   ");
        System.out.println("----------------------");

    }
}
