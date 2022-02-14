/**********************************************************************************************
 * 20) Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor
 * maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler
 * novamente). Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo
 * menor.
 ***********************************************************************************************/
package br.com.abc.introducao.Exercicios.Ex20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a, b, c, menor = 0, maior = 0;
        boolean status = false;

        System.out.println("=========================================");
        System.out.println("|         Status de 3 Variáveis         |");
        System.out.println("=========================================");


        while (status == false){
            System.out.print("\nDigite um valor inteiro maior que 0 para a variável A: ");
            a = entrada.nextInt();
            menor = a;
            maior = a;
            System.out.print("\nDigite um valor inteiro maior que 0 para a variável B: ");
            b = entrada.nextInt();
            if (b < menor){
                menor = b;
            }
            if (b > maior){
                maior = b;
            }
            System.out.print("\nDigite um valor inteiro maior que 0 para a variável C: ");
            c = entrada.nextInt();
            if (c < menor){
                menor = c;
            }
            if (c > maior){
                maior = c;
            }
            if (a > 0 && b > 0 && c > 0){
                status = true;
            }else {
                System.out.println("-----------------------------------------------");
                System.out.println("     Valores inválidos, digite novamente!");
                System.out.println("-----------------------------------------------");
            }

        }

        System.out.println("------------------------");
        System.out.println("        Validado!");
        System.out.println("------------------------");

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        System.out.println("----------------------------------------------------------");
        System.out.println("Menor valor lido multiplicado pelo maior: " + menor + " * " + maior + " = " + (menor*maior));
        System.out.println("Maior valor lido dividido pelo menor: " + maior + " / " + menor + " = " + (maior/menor));
        System.out.println("----------------------------------------------------------");

    }
}
