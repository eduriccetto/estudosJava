/*******************************************************************************
 * 30) Faça um programa para imprimir uma tabuada.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex30;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int valor;

        System.out.println("======================================");
        System.out.println("|                Tabuada             |");
        System.out.println("======================================");

        System.out.print("\nDigite o número da tabuada que deseja visualizar: ");
        valor = entrada.nextInt();

        System.out.println("\n----------------------------------");
        System.out.println("|          Tabuada do "+valor+"          |");
        System.out.println("----------------------------------");

        for (int x = 1; x <= 10; x++){
            System.out.println(valor+"*"+x+"="+(valor*x));
            System.out.println("-------------");
        }


    }
}
