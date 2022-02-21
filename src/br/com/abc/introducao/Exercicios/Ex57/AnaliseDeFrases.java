/*******************************************************************************
 * 57) Fazer um programa que leia uma frase e imprima somente as vogais.
 *******************************************************************************/
package br.com.abc.introducao.Exercicios.Ex57;

import java.util.Locale;
import java.util.Scanner;

public class AnaliseDeFrases {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase, vogais = "AEIOU", novaFrase = "";

        System.out.println("===================================");
        System.out.println("|       Analise de Frases!        |");
        System.out.println("===================================");

        System.out.println("\n");
        System.out.print("Digite uma frase: ");
        frase = entrada.nextLine().toUpperCase(Locale.ROOT);

        System.out.println("\n");
        System.out.println(frase);

        char[] ArrayChars = frase.toCharArray();
        for (int i = 0; i < frase.length(); i++) {
            if (vogais.contains(""+ArrayChars[i])){
                novaFrase += ArrayChars[i];
            }
        }
        System.out.println("===============================");
        System.out.println("\n");
        System.out.println("Só as vogais: "+novaFrase);

        System.out.println("\n");
        System.out.println("---------------------");
        System.out.println("   Fim da Execução  |");
        System.out.println("---------------------");

    }
}
