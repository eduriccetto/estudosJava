/*******************************************************************************
 * 41) Faça um programa que dada a idade de um nadador, classifique-o em uma das
 * seguintes categorias:
 * 	- Infantil A = 5 a 7 anos
 * 	- Infantil B = 8 a 11 anos
 * 	- Juvenil A = 12 a 13 anos
 * 	- Juvenil B = 14 a 17 anos
 * 	- Adultos = Maiores de 18 anos
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex41;

import java.util.Scanner;

public class CategoriaNatacao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("=====================================");
        System.out.println("|        Categoria de Nadador       |");
        System.out.println("=====================================");

        System.out.print("\nDigite a idade do nadador(a): ");
        idade = entrada.nextInt();

        if (idade < 5){
            System.out.println("---------------------------");
            System.out.println("    Não pode nadar!");
            System.out.println("---------------------------");
        }
        if ((idade >= 5)&&(idade <= 7)){
            System.out.println("---------------------------");
            System.out.println("    Categoria Infantil A!  ");
            System.out.println("---------------------------");
        }
        if ((idade >= 8)&&(idade <= 11)){
            System.out.println("---------------------------");
            System.out.println("    Categoria Infantil B!  ");
            System.out.println("---------------------------");
        }
        if ((idade >= 12)&&(idade <= 13)){
            System.out.println("---------------------------");
            System.out.println("    Categoria Juvenil A!  ");
            System.out.println("---------------------------");
        }
        if ((idade >= 14)&&(idade <= 17)){
            System.out.println("---------------------------");
            System.out.println("    Categoria Juvenil B!  ");
            System.out.println("---------------------------");
        }
        if (idade >= 18){
            System.out.println("---------------------------");
            System.out.println("    Categoria Adulto!  ");
            System.out.println("---------------------------");
        }

        System.out.println("\n");
        System.out.println("===================");
        System.out.println("  FIM da Execução!");
        System.out.println("===================");

    }
}
