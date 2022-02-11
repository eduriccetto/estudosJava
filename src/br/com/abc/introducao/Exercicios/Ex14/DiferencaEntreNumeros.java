package br.com.abc.introducao.Exercicios.Ex14;

import java.util.Scanner;

public class DiferencaEntreNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2, diferenca;

        System.out.println("===========================================");
        System.out.println("|  Calculadora Diferença entre 2 números  |");
        System.out.println("===========================================");

        System.out.print("\nDigite um valor inteiro para N1: ");
        n1 = entrada.nextInt();
        System.out.print("\nDigite um valor inteiro para N2: ");
        n2 = entrada.nextInt();

        diferenca = n1 - n2;
        if (diferenca < 0){
            diferenca = diferenca * -1;
        }

        System.out.println("----------------------------------------------");
        System.out.println("\nA diferença entre N1:(" + n1 + ") e N2:(" + n2 + ") é: " + diferenca);
        System.out.println("----------------------------------------------");


    }
}
