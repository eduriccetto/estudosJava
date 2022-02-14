package br.com.abc.introducao.Exercicios.Ex16;

import java.util.Scanner;

public class StatusNumerico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2, maior, menor;

        System.out.println("=======================================");
        System.out.println("|          Status Numérico            |");
        System.out.println("=======================================");

        System.out.print("\nDigite um valor inteiro para n1: ");
        n1 = entrada.nextInt();
        System.out.print("\nDigite um valor inteiro para n1: ");
        n2 = entrada.nextInt();

        if (n1 > n2){
            maior = n1;
            menor = n2;
        }else {
            maior = n2;
            menor = n1;
        }

        if (n1 != n2){
            System.out.println("O maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor);
        } else {
            System.out.println("O valor de n1: " + n1 + " e n2: " + n2 + " são iguais.");
        }

    }
}
